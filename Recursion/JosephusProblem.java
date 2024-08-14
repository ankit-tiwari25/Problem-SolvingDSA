package Recursion;

import java.util.List;
import java.util.ArrayList;
// Josephus problem
// Last video : 19 by Aditya Verma Recurson Series
public class JosephusProblem {
    public static void main(String[] args) {
        int n = 8;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i+1);
        }
        int k = 2;
        k = k-1;
        int index = 0;
        System.out.println(list);
        solve(list, k , index);
        System.out.println(list.get(0));

        
    }
    public static void solve(List<Integer> list , int k, int index){
        if(list.size() == 1){
            return;
        }

        index = (index + k) % list.size();
        list.remove(index);
        solve(list, k, index);
    }
}
