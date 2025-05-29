
/* 3373.[Hard] Maximize the Number of Target Nodes After Connecting Trees II */

import java.util.ArrayList;
import java.util.List;

public class May29Problem3373MaximizetheNumberofTargetNodesAfterConnectingTreesII {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> buildList(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return adj;
    }
    public static void dfsColor(List<List<Integer>> adj, int u, int parent, int[] color, boolean isA) {
        if (color[u] == 0) {
            if (isA) evenA++;
            else evenB++;
        } else {
            if (isA) oddA++;
            else oddB++;
        }
        for (int v : adj.get(u)) if (v != parent) {
            color[v] = color[u] ^ 1;
            dfsColor(adj, v, u, color, isA);
        }
    }
}
