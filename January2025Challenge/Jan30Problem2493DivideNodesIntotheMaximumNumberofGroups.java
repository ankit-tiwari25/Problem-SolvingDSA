package January2025Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 2493. Divide Nodes Into the Maximum Number of Groups */
public class Jan30Problem2493DivideNodesIntotheMaximumNumberofGroups {
    private static int[] color; // Tracks bipartition colors (0/1)
    private static List<List<Integer>> adj; // Adjacency list
    private static int n; // Number of nodes
    public static void main(String[] args) {
        
    }
     // DFS to check bipartiteness and collect component nodes
    public static int magnificentSets(int n, int[][] edges) {
        this.n = n;
        color = new int[n];
        Arrays.fill(color, -1);
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            int u = edge[0] - 1, v = edge[1] - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        List<List<Integer>> components = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                List<Integer> component = new ArrayList<>();
                if (!isBipartite(i, 0, component)) 
                    return -1; // Non-bipartite component
                components.add(component);
            }
        }

        int total = 0;
        for (List<Integer> comp : components) {
            total += maxGroupsInComponent(comp);
        }

        return total;
    }
}
