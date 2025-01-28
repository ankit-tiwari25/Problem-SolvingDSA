package January2025Challenge;

/* 2658.[Medium] Maximum Number of Fish in a Grid */
public class Jan28Problem2658MaximumNumberofFishinaGrid {
    public static int m, n, dir[] = {-1,0,1,0,-1};

    public static void main(String[] args) {
        int[][] grid = {{0,2,1,0},{4,0,0,3},{1,0,0,4},{0,3,2,0}};
        System.out.println(findMaxFish(grid));
    }
    private static int dfs(int[][] grid, int i, int j) {
        if (i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) return 0;
        int sum = grid[i][j];
        grid[i][j] = 0;
        for (int k=0; k<4; k++)
            sum += dfs(grid, i+dir[k], j+dir[k+1]);
        return sum;
    }
    public static int findMaxFish(int[][] grid) {
        m = grid.length; n = grid[0].length;
       int maxFish = 0;
       for (int i=0; i<m; i++)
           for (int j=0; j<n; j++)
               if (grid[i][j]>0)
                   maxFish = Math.max(maxFish, dfs(grid,i,j));
       return maxFish;
   }
}
