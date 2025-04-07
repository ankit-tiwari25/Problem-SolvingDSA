package AprilChallenge2025;
/* 416.[Medium] Partition Equal Subset Sum */
public class April7Problem416PartitionEqualSubsetSum {
    public static void main(String[] args) {
      int[]  nums = {1,5,11,5};
      System.out.println(canPartition(nums));
    }
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        if (totalSum % 2 != 0) return false;
        int targetSum = totalSum / 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int currSum = targetSum; currSum >= num; currSum--) {
                dp[currSum] = dp[currSum] || dp[currSum - num];
                if (dp[targetSum]) return true;
            }
        }
        return dp[targetSum]; 
    }
}