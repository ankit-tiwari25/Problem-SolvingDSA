/*
 * Question : Given a matrix of size N X M.  Calculate sum of all submatrix sums.
 * Appraoch : Contribution Technique.
 */

public class SumofAllSubmatrixSum {
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

        System.out.println("All submatrix sum : " + allSubmatrixSum(mat));

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

    public static int allSubmatrixSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int contri = (i + 1) * (j + 1) * (n - i) * (m - j);
                ans = ans + mat[i][j] * contri;
            }
        }
        return ans;
    }
}
