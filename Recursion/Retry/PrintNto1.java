package Recursion.Retry;
/* IBH Method : Induction, Base condition and Hypothesis */
public class PrintNto1 {
    public static void main(String[] args) {
        int n = 10;
        printNto1(n);
    }
    public static void printNto1(int n){
        /* base condition */
        if(n == 1){
             System.out.print(" " + n);
            return;
        }
        System.out.print(" " + n);
        printNto1(n-1);
    }
}
