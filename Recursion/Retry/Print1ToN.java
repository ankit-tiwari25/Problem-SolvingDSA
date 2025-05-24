package Recursion.Retry;
/* IBH Method : Induction, Base Condition And Hypothesis */
public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        print1toN(n);
    }
    public static void print1toN(int n){
        /* Base condition */
        if(n == 1){
            // System.out.print(n  + " ");
            return;
        }
        print1toN( n - 1);
        System.out.print(" " + (n-1));
    }
}
