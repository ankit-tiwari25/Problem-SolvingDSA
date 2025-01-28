package January2025Challenge;

/* 2658.[Medium] Maximum Number of Fish in a Grid */
public class Jan28Problem2658MaximumNumberofFishinaGrid {
    public static void main(String[] args) {
        
    }
    public int findMaxFish(int[][] grid) {
        m = grid.length; n = grid[0].length;
       int maxFish = 0;
       for (int i=0; i<m; i++)
           for (int j=0; j<n; j++)
               if (grid[i][j]>0)
                   maxFish = Math.max(maxFish, dfs(grid,i,j));
       return maxFish;
   }
}
