/* 2685.[Medium] Count the Number of Complete Components */

import java.util.ArrayList;
import java.util.List;

public class March22Problem2685CounttheNumberofCompleteComponents {
    public static void main(String[] args) {
        
    }
     public static int countCompleteComponents(int n, int[][] edges) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge : edges){
            int a = edge[0];
            int b= edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a); 
        }
        int []vis= new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                List<Integer> ls = new ArrayList<>();
                int edgecount = dfs(i,vis,adj,ls);
                int nodecount = ls.size();
                if(nodecount*(nodecount-1) ==  edgecount)count++;
            }
        }
        return count;
    }
    public static int  dfs(int node,int []vis,ArrayList<ArrayList<Integer>> adj,List<Integer> ls){
        vis[node]=1;
        ls.add(node);
        int ct=0;
        for(int i :adj.get(node)){
            if(vis[i]==0){
                ct+=dfs(i,vis,adj,ls);
            }
            ct++;
        }
        return ct;
    }
}
