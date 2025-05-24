package Recursion.Retry;
/* Print table of n
 *  if n = 5
 * output 
 * 5 X 1 = 5
 * ...
 * 5 X 10 = 50
 */
public class TableOfN {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        printTableOfN(n, m);;
    }
    public static void printTableOfN(int n, int m){
        if(m ==1){
            System.out.println(n + " X " + m + " = " + (n*m));
            return;
        }
        printTableOfN(n, m-1);
        System.out.println(n + " X " + m + " = " + (n*m));
    }
}
