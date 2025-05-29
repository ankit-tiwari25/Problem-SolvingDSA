
/* 3373.[Hard] Maximize the Number of Target Nodes After Connecting Trees II */

import java.util.ArrayList;
import java.util.List;

public class May29Problem3373MaximizetheNumberofTargetNodesAfterConnectingTreesII {
    public static void main(String[] args) {
        
    }
     List<List<Integer>> buildList(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return adj;
    }
}
