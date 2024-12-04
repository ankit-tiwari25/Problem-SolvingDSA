package DecemberChallenge;
/*
 * 2825. [Medium] Make String a Subsequence Using Cyclic Increments
 */
public class December4Problem2825MakeStringASubsequenceUsingCyclicIncrements {
   public static void main(String[] args) {
    String str1 = "ab";
    String str2 = "d";


    System.out.println("Ans : " + canMakeSubsequence(str1, str2));
    }
   public static boolean canMakeSubsequence(String str1, String str2) {
     
    int n = str1.length();
    int m = str2.length();

    if(m > n){
        return false;
    }
     int i = 0, j = 0;
    while( i < n && j < m){
        char nextChar = (char)((str1.charAt(i) - 'a' + 1)%26 + (int)('a'));
        // System.out.println("Next char : " + nextChar);
        if(str1.charAt(i) == str2.charAt(j) || str2.charAt(j) == nextChar){
            j++;
        }
        i++;
    }

    // System.out.println(" j : " + j);

    if(j != m){
        return false;
    }

    return true;
   }
}
