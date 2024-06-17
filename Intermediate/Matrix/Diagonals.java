package Matrix;

public class Diagonals {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printDiagonals(mat);

    }
    public static void printDiagonals(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        //primary Diagonal

        System.out.println("\n Primary Diagonal");

        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\n Secondary Diagonal");
        //Secondary Daigonal

        for(int i = 0, j = n-1; i < n; i++,j--){
            System.out.print( mat[i][j] + " ");
        }
    }

    
}
