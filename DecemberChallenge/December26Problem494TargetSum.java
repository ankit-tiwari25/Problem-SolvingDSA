package DecemberChallenge;

/*
 * 494. [Medium] Target Sum
 */
public class December26Problem494TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);

}
private static int helper(int[] arr, int target, int idx, int sum) {
  if (idx >= arr.length)
      return sum == target ? 1 : 0;
  
  int subtract = helper(arr, target, idx + 1, sum - arr[idx]);
  int add = helper(arr, target, idx + 1, sum + arr[idx]);

  return subtract + add;
}
}
