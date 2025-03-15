package March2025Challenge;

import java.util.Arrays;

/* 2560.[Medium] House Robber IV */
public class March15Problem2560HouseRobberIV {
    private boolean canStealKHouses(int[] nums, int k, int capability) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= capability) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= k;
    }
       public static int minCapability(int[] nums, int k) {
        int left = Arrays.stream(nums).min().getAsInt();
        int right = Arrays.stream(nums).max().getAsInt();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canStealKHouses(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
