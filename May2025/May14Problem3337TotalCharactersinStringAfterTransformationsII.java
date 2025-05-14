/* 3337.[Hard] Total Characters in String After Transformations II */
public class May14Problem3337TotalCharactersinStringAfterTransformationsII {
     private static final int mod = 1000000007;
      private static long[][] multiplyMatrices(long[][] A, long[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        long[][] result = new long[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                long sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum = (sum + (A[i][k] * B[k][j]) % mod) % mod;
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
