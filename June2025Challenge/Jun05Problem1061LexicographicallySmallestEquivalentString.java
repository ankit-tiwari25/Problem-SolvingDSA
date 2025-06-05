package June2025Challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 1061.[Medium] Lexicographically Smallest Equivalent String */
public class Jun05Problem1061LexicographicallySmallestEquivalentString {
    public static void main(String[] args) {
        
    }
     public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character, List<Character>> adj = new HashMap<>();
        int n = s1.length();

        // Build the adjacency list
        for (int i = 0; i < n; i++) {
            char u = s1.charAt(i);
            char v = s2.charAt(i);

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : baseStr.toCharArray()) {
            boolean[] visited = new boolean[26];
            char minChar = dfs(adj, ch, visited);
            result.append(minChar);
        }

        return result.toString();
    }
}
