/*
 * Question : Given a matrix with dimension n*m. Find the max sub matrix sum where 
 *            submatrix starts from Oth row and ends at any row.
 * 
 * Approach: Using Kadane's Algorithm
 */

public class MaxOfAllSubmatrixSum {
    public static void main(String[] args) {
        int mat[][] = {
                { 2, -4, 1, 3, -1, 2 },
                { 1, 3, 2, -7, 3, 3 },
                { 0, -1, 1, 3, 4, -7 },
                { 1, -1, -6, 4, -4, 6 },
        };

        System.out.println("Given Matrix");
        printMatrix(mat);

        System.out.println("Maximum submatrix sum : " + maximumSubmatirxSum(mat));
    }

    public static int maximumSubmatirxSum(int[][] mat) {
        int maxSum = Integer.MIN_VALUE;

        int n = mat.length;
        int m = mat[0].length;

        int arr[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j] = arr[j] + mat[i][j];
            }

            // Applying kadane's algorithm
            int sum = 0;
            int maxArrayValue = Integer.MIN_VALUE;

            for (int k = 0; k < m; k++) {
                sum += arr[k];
                maxArrayValue = Math.max(maxArrayValue, sum);

                if (sum < 0) {
                    sum = 0;
                }
            }

            maxSum = Math.max(maxArrayValue, maxSum);
        }

        return maxSum;
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

}
