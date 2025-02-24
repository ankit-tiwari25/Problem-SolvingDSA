import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Feb24Problem2467MostProfitablePathinaTree {
       public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
          int n = amount.length;

        Map<Integer, Set<Integer>> graph = new HashMap<>();
        
        for (int i = 0; i < n; i++) graph.put(i, new HashSet<>());
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        
        // 1. find path
        dfs(bob, 0, graph, new ArrayList<Integer>(){{add(bob); }}, new HashSet<Integer>(){{add(bob); }});

        // 2. modify tree
        for (int i = 0; i < b2a.size() / 2; i++) {
            amount[b2a.get(i)] = 0;
        }
        if (b2a.size() % 2 != 0) {
            int m = b2a.get(b2a.size() / 2);
            amount[m] /= 2;
        }
        
        // 3. get result
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        maxPathSum(0, graph, amount, visited, amount[0]);
        return maxSum;
    }
    
}
