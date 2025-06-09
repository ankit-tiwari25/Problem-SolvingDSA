package June2025Challenge;
/* 440.[Hard] K-th Smallest in Lexicographical Order */
public class Jun09Problem440KthSmallestinLexicographicalOrder {
    public static void main(String[] args) {
        
    }
    static public int findKthNumber(int n, int K) {
        long k = K;
        int ans = solve(0, n, k);
        return ans;
    }
}
