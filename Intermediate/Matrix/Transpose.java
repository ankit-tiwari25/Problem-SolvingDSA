package Matrix;

//Intermediate 1 - 2D Array
// Transpose of a matrix without using any extra space
public class Transpose {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Before Transpose");
        displayMatrix(mat);
        int[][] ans = transposeWithExtraSpace(mat);

        System.out.println("After Transpose");

        displayMatrix(ans);
    }

    public static int[][] transposeWithExtraSpace(int[][] mat){

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
