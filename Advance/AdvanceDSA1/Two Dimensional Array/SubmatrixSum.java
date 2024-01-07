/*
 * Question : 1 
 * For each query, find sum of given submatrix. 
 * Approach : Using prefix sum
 */

class SubmatrixSum {
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
        int pfSum[][] = prefixSumMatrix(mat);
        System.out.println("Prefix sum matrix");
        printMatrix(pfSum);

        // Here, r1,c1,r2,c2 are quries
        int sum = subMatrixSum(pfSum, 1, 1, 3, 3);
        System.out.println("Sum : " + sum);
    }

    public static int[][] prefixSumMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] psum = new int[n][m];

        // Applying psum on rows
        for (int i = 0; i < n; i++) {
            psum[i][0] = mat[i][0];

            for (int j = 1; j < m; j++) {
                psum[i][j] = mat[i][j] + psum[i][j - 1];
            }

        }

        System.out.println("After applying psum to rows");
        printMatrix(psum);
        // Applying psum on cols... rows will change

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                psum[i][j] = psum[i][j] + psum[i - 1][j];
            }
        }

        return psum;
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

    public static int subMatrixSum(int[][] mat, int r1, int c1, int r2, int c2) {
        // r1 and c1 --> top left
        // r2 and c2 --> bottom right
        int ans = 0;
        if (r1 > 0 && c1 > 0) {
            ans = mat[r2][c2] - mat[r1 - 1][c2] - mat[r2][c1 - 1] + mat[r1 - 1][c1 - 1];
        } else if (r1 > 0) {
            ans = mat[r2][c2] - mat[r2][c1 - 1];
        } else if (c1 > 0) {
            ans = mat[r2][c2] - mat[r1 - 1][c2];
        }

        return ans;
    }
}