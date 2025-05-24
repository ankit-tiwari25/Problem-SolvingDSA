package Recursion.Retry;
/*  Program for N^M 
 *  Input : 
 * n = 2
 * m = 3
 * Output : 8
*/
public class PrintNRaisedToThePowerM {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(printNRaisedToThePowerM(n, m));
    }
    public static int printNRaisedToThePowerM(int n, int m){
        /* Base Condition */
        if(m == 1){
            return n; //n ^ 1 = n
        }
        int ans = n * printNRaisedToThePowerM(n, m-1);
        return ans;
    }
}
