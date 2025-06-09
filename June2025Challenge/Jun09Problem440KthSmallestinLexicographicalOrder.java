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
     static int solve(long current, long n, long k) {
        if(k == 0) 
             return (int) (current / 10);

        for (long i = Math.max(current, 1); i < current + 10; i++) {
            long count = numOfChildren(i, i + 1, n);
            if (count >= k) 
                return solve(i * 10, n, k - 1);
            k-= count;
        }

        return -1;
    }
}
