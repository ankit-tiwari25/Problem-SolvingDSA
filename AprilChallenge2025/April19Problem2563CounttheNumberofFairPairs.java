
/* 2563.[Medium] Count the Number of Fair Pairs */

import java.util.Arrays;

public class April19Problem2563CounttheNumberofFairPairs {
    public static void main(String[] args) {
      int[]  nums = {0,1,7,4,4,5};
      int lower = 3, upper = 6;
      System.out.println(countAtLeast(nums, upper));
    }
    public static long countAtLeast(int[] nums, long comp) {
        long ans = 0; int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] >= comp) {
                ans += j - i;
                j--;
            }
            else i++;
        }
        return ans;
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countAtLeast(nums, lower) - countAtLeast(nums, upper+1);
    }
}
