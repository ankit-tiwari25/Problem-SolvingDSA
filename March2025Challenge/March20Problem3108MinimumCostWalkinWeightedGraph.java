
/* 3108.[Hard] Minimum Cost Walk in Weighted Graph */
public class March20Problem3108MinimumCostWalkinWeightedGraph {
    public static void main(String[] args) {
        
    }
    private static int findRoot(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findRoot(parent, parent[node]);
        }
        return parent[node];
    }
}
