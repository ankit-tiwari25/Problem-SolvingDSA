package Matrix;

//Intermediate - 1 : 2D Array
// Print column wise sum;
public class ColumnwiseSum {
    public static void main(String[] args) {
        int[][] mat = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
        };

        int ans[] = colwiseSum(mat);
        display(ans);
    }
    public static int[] colwiseSum(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += mat[j][i];
            }
            ans[i] = sum;
        }

        return ans;
    }

    public static void display(int[] ans){
        for(int i : ans){
            System.out.print(" " + i);
        }
        System.out.println();
    }
    
}
