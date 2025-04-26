/* 2444.[Hard] Count Subarrays With Fixed Bounds */
public class April26Problem2444CountSubarraysWithFixedBounds {
    public static void main(String[] args) {
        int[]  nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
          int start = -1, mini = -1, maxi = -1;
          for (int i = 0; i < nums.length; i++) {
              if (nums[i] < minK || nums[i] > maxK) start = i;
              if (nums[i] == maxK) maxi = i;
              if (nums[i] == minK) mini = i;
              int valid = Math.max(0, Math.min(mini, maxi) - start);
              count += valid;
          }
          return count;   
      }
}
