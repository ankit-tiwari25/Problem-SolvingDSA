/* 2799.[Medium] Count Complete Subarrays in an Array */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class April24Problem2799CountCompleteSubarraysinanArray {
    public static void main(String[] args) {
        int[]  nums = {1,3,1,2,2};
        System.out.println(countCompleteSubarrays(nums));
    }
     public static int countCompleteSubarrays(int[] nums) {
     int left = 0, res = 0;
        int k = (int) Arrays.stream(nums).distinct().count();
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            while (mpp.size() == k) {
                res += nums.length - i;
                mpp.put(nums[left], mpp.get(nums[left]) - 1);
                if (mpp.get(nums[left]) == 0) mpp.remove(nums[left]);
                left++;
            }
        }
        return res;   
    }
}
