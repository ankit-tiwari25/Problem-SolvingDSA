/*
 * Question : Max of all submatrix sum. Starting from anywhere and ending at anywhere between the cells.
 * Approach : Using contribution technique.
 */

public class MaxSubmatrixSum {
    public static void main(String[] args) {
        int mat[][] = {
                { 2, -1, 3, 2 },
                { 3, 2, 6, 2 },
                { 10, 9, 8, 2 },
                { 4, -1, 2, 3 },
                { 3, 2, 6, 9 }
        };
        System.out.println("Given Matrix");
        printMatrix(mat);

        System.out.println("Max submatrix sum : " + maxSubmatrixSum(mat));
    }

    public static void printMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
    }

    public static int maxSubmatrixSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int contri = (i + 1) * (j + 1) * (n - i) * (m - j);
                sum = mat[i][j] * contri;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
