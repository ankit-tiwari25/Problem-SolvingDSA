package Matrix;

// Intermediate 1 _ 2D Array
// Print Both diagonals
// Print all diagonals from one matrix
public class Diagonals {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printDiagonals(mat);
        printDiagonalsRightToLeft(mat);

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
        System.out.println();
    }

    public static void printDiagonalsRightToLeft(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        //Print all diagonals starting from 0th row
        for(int c = 0; c < m; c++){
            int  i = 0;
            int  j = c;

            while(i < n && j >= 0){
                System.out.print(mat[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }

        //Print all diagonals starting from m-1 col
        for(int r = 1; r < m; r++){
            int  i = r;
            int  j = m-1;

            while(i < n && j >= 0){
                System.out.print(mat[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }

    
}
