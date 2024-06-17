package Matrix;

// Intermediate - 1 : 2D Array
//Rotate matrix by 90 degree

/*
 * 
 *      1   2   3                7   4    1
 *      4   5   6       --->     8   5    2
 *      7   8   9                9   6    3
 */

 /*
  * Solution 
 *      1   2   3  (Transpose)     1   4  7       (Swap first and last column)          7   4    1
 *      4   5   6  ----------->    2   5  8                 --->                        8   5    2
 *      7   8   9                  3   6  9                                             9   6    3

  1. Transpose 
  2. Swap first column with last
  */
public class RotateMatrixByXDegree {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Before Rotation");
        displayMatrix(mat);
        System.out.println("After Rotation");
        mat = roateNintyDegree(mat);
        displayMatrix(mat);
    }

    public static int[][] roateNintyDegree(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

         mat = transpose(mat);

        // Swap first and last column and so on..

        for(int i = 0, j = m-1; i <= j; i++, j--){
            for(int r = 0; r < n; r++){
                int temp = mat[r][i];
                mat[r][i] = mat[r][j];
                mat[r][j] = temp;
            }
        }
        return mat;
    }

    public static int[][] transpose(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < m; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
    public static void displayMatrix(int[][] mat){
        for(int[] i : mat){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
