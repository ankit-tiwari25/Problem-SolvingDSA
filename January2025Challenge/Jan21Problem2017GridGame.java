package January2025Challenge;
/* 2017.[Medium] Grid Game */
public class Jan21Problem2017GridGame {
    public static void main(String[] args) {
       int[][] grid = {{2,5,4},{1,5,1}};
       System.out.println(gridGame(grid));
    }
    public static long gridGame(int[][] grid) {
        long minResult = Long.MAX_VALUE;
        long row1Sum = 0;
        for (int i = 0; i < grid[0].length; ++i) {
            row1Sum += grid[0][i];
        }
        long row2Sum = 0;

        for (int i = 0; i < grid[0].length; ++i) {
            row1Sum -= grid[0][i];
            minResult = Math.min(minResult, Math.max(row1Sum, row2Sum));
            row2Sum += grid[1][i];
        }

        return minResult;   
    }
}
