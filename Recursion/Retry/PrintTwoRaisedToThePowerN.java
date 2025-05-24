package Recursion.Retry;
/* IBH Method : Induction, Base Condtion and Hypothesis */
/* if n = 3 output : 8 */
public class PrintTwoRaisedToThePowerN {
    public static void main(String[] args) {
        int n = 5;
       System.out.println( printTwoRaisedToThePowerN(n));;
    }
    public static int printTwoRaisedToThePowerN(int n){
        /* Base Conditon */
        if(n == 1){
            return 2; // 2^1 = 2
        }
        int ans = 2 * printTwoRaisedToThePowerN(n-1);
        return ans;
    }
}
