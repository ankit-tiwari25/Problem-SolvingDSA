package Recursion;
// 779. [Medium] K-th Symbol in Grammar
// Recursion
/*  0 -> 0 1
    1 -> 1 0
    N -> row, k -> column
 *   N = 1 : 0
 *   N = 2 : 0 1
 *   N = 3 : 0 1 1 0
 *   N = 4 : 0 1 1 0 1 0 0 1
 * 
 */
public class KthSymbolinGrammar {
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        System.out.println(solveGrammar(n, k));
    }

    public static int solveGrammar(int n, int k){
        if(n == 1 && k == 1){
            return 0;
        }

        int len = (int)Math.pow(2,n-1);
        int mid = len / 2;

        if(k <= mid){
            return solveGrammar(n-1, k);
        }
        int x = solveGrammar(n-1, k-mid);
        return x == 0 ? 1 : 0;
    }
}
