package Recursion.Retry;
/* 5! = 120 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if( n == 1){
            return 1;
        }

        int ans = n * factorial(n-1);
        return ans;
    }
}
