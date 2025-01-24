package January2025Challenge;

import java.util.ArrayList;
import java.util.List;

/* 802. [Medium] Find Eventual Safe States */
public class Jan24Problem802FindEventualSafeStates {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(eventualSafeNodes(graph));
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
           int n = graph.length;
        int[] state = new int[n]; // 0: unvisited, 1: visiting, 2: safe
        List<Integer> safe = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(graph, i, state)) {
                safe.add(i);
            }
        }
        
        return safe;
    }
    private static boolean dfs(int[][] graph, int node, int[] state) {
        if (state[node] > 0) return state[node] == 2; // Already safe
        
        state[node] = 1; // Mark as visiting
        
        for (int next : graph[node]) {
            if (state[next] == 1 || !dfs(graph, next, state)) {
                return false; // Cycle detected
            }
        }
        
        state[node] = 2; // Mark as safe
        return true;
    }
    public static void display(List<Integer> arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
