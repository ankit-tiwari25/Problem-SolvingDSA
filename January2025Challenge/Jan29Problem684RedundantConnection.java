package January2025Challenge;

/* 684.[Medium] Redundant Connection */
public class Jan29Problem684RedundantConnection {
    private static int[] parent;
    private static int[] rank;
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        display(findRedundantConnection(edges));
    }
 
public static int[] findRedundantConnection(int[][] edges) {
    int n = edges.length;
    parent = new int[n + 1];
    rank = new int[n + 1];

    // Initialize each node as its own parent
    for (int i = 1; i <= n; i++) {
        parent[i] = i;
    }

    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];

        if (find(u) == find(v)) {
            return edge; // Cycle detected
        }
        join(u, v); // Merge sets
    }

    return new int[0]; // Unreachable for valid inputs
}
private static int find(int i) {
    if (parent[i] != i) {
        parent[i] = find(parent[i]); // Path compression
    }
    return parent[i];
}
private static void join(int u, int v) {
    int rootU = find(u);
    int rootV = find(v);

    if (rootU != rootV) {
        // Union by rank
        if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
    }
}

public static void display(int[] arr){
    for(int i : arr){
        System.out.print(" " + i);
    }
    System.out.println();
}
}
