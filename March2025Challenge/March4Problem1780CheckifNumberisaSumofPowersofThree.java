package March2025Challenge;
/* 1780. [Medium] Check if Number is a Sum of Powers of Three */
public class March4Problem1780CheckifNumberisaSumofPowersofThree {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(checkPowersOfThree(n));
    }
    public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
           if (n % 3 == 2) {
               return false;
           }
           n /= 3;
       }
       return true;
   }
}
