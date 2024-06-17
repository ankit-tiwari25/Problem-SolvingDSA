package Matrix;

// Print Rowwise sum
/*
 * {1,2,3  = 6
 *  4,5,6  = 15
 *  7,8,9} = 24
 */
public class RowwiseSum {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int ans[] = rowSum(mat);
        display(ans);
        
    }
    public static int[] rowSum(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int rowsum[] = new int[n];

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum = sum + mat[i][j];
            }
            rowsum[i] = sum;
        }
        return rowsum;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
