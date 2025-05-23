
/* 3068.[Hard] Find the Maximum Sum of Node Values */
public class May23Problem3068FindtheMaximumSumofNodeValues {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int k = 3;
        int[][] edges = {{0,1},{0,2}};
        System.out.println(maximumValueSum(nums, k, edges));
    }
    public static long maximumValueSum(int[] nums, int k, int[][] edges) {
        long[] dp = {0, Long.MIN_VALUE};
        for (int n : nums) {
            long cnt0 = dp[0] + n, cnt1 = dp[1] + n;
            int x = n ^ k;
            dp = new long[]{ Math.max(cnt0, dp[1] + x), 
                             Math.max(cnt1, dp[0] + x) };
        }
        return dp[0]; 
    }
}
