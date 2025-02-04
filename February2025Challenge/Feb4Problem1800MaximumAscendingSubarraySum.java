package February2025Challenge;
/*1800. [Easy] Maximum Ascending Subarray Sum */
public class Feb4Problem1800MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
          int curr = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = nums[i] > nums[i - 1] ? curr + nums[i] : nums[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
