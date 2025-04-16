/* 2537.[Medium] Count the Number of Good Subarrays */

import java.util.HashMap;
import java.util.Map;

public class April16Problem2537CounttheNumberofGoodSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int k = 10;
        System.out.println(countGood(nums, k));
    }
     public static long countGood(int[] nums, int k) {
      Map<Integer, Integer> freq = new HashMap<>();
        long prev_count = 0, res = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            prev_count += freq.getOrDefault(nums[right], 0);
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            
            while (prev_count >= k) {
                res += nums.length - right;
                prev_count -= freq.get(nums[left]) - 1;
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
        }
        
        return res;  
    }
}
