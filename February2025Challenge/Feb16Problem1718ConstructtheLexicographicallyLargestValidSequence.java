/* 1718.[Medium] Construct the Lexicographically Largest Valid Sequence */
public class Feb16Problem1718ConstructtheLexicographicallyLargestValidSequence {
    public static void main(String[] args) {
        
    }
    public static int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        backtrack(result, used, n, 0);
        return result;  
    }
}
