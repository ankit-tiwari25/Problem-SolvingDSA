package January2025Challenge;

// 1267.[Medium] Count Servers that Communicate
public class Jan23Problem1267CountServersthatCommunicate {
   public static void main(String[] args) {
    
   } 
   public int countServers(int[][] grid) {
    int[] Rows = new int[grid.length];
   int[] Col = new int[grid[0].length];
   for (int i = 0; i < grid.length; i++) {
       for (int j = 0; j < grid[0].length; j++) {
           Rows[i] += grid[i][j];
           Col[j] += grid[i][j];
       }
   }
   int ans = 0;
   for (int i = 0; i < grid.length; i++) {
       for (int j = 0; j < grid[0].length; j++) {
           if (grid[i][j] == 1 && (Rows[i] > 1 || Col[j] > 1)) {
               ans++;
           }
       }
   }
   return ans;
}
}
