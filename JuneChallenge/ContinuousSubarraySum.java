package JuneChallenge;

import java.util.HashMap;
import java.util.Map;

// 523. Continuous Subarray Sum
// 8  June 2024
//TODO
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
     public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        int cumulativeSum = 0;
        
        // Step 1: Initialize Remainder Map
        remainderMap.put(0, -1);
        
        // Step 2: Iterate Through the List
        for (int i = 0; i < n; i++) {
            // Step 3: Calculate Cumulative Sum
            cumulativeSum += nums[i];
            
            // Step 4: Calculate Remainder
            int remainder = k == 0 ? cumulativeSum : cumulativeSum % k;
            
            // Step 5: Update Remainder Map
            if (remainderMap.containsKey(remainder)) {
                // Check if segment length is at least two
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        
        // Step 6: Return the Result
        return false;
    }
}
