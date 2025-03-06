package March2025Challenge;

/* 2965.[Easy] Find Missing and Repeated Values */
public class March6Problem2965FindMissingandRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        int[] ans = findMissingAndRepeatedValues(grid)
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
       int size = n * n;
       int[] freq = new int[size + 1];
       int repeated = -1, missing = -1;

       for (int[] row : grid) {
           for (int num : row) {
               freq[num]++;
           }
       }

       for (int num = 1; num <= size; num++) {
           if (freq[num] == 2) repeated = num;
           if (freq[num] == 0) missing = num;
       }

       return new int[]{repeated, missing};
   }
}
