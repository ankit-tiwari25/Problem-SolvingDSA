/* 3372.[Medium] Maximize the Number of Target Nodes After Connecting Trees I */

import java.util.ArrayList;
import java.util.List;

public class May28Problem3372MaximizetheNumberofTargetNodesAfterConnectingTreesI {
    public static void main(String[] args) {
        
    }
     private static List<List<Integer>> buildList(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return adj;
    }
}
