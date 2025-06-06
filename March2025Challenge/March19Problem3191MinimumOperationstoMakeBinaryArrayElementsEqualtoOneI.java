package March2025Challenge;
/* 3191.[Medium] Minimum Operations to Make Binary Array Elements Equal to One I */
public class March19Problem3191MinimumOperationstoMakeBinaryArrayElementsEqualtoOneI {
    public static void main(String[] args) {
        int[]  nums = {0,1,1,1,0,0};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int count = 0;
      int n = nums.length;

      for (int i = 0; i < n - 2; i++) {
          if (nums[i] == 0) {
              nums[i] ^= 1;
              nums[i + 1] ^= 1;
              nums[i + 2] ^= 1;
              count++;
          }
      }

      return (nums[n - 2] == 1 && nums[n - 1] == 1) ? count : -1;
  }
}
