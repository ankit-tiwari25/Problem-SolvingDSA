/* 2845.[Medium] Count of Interesting Subarrays */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class April25Problem2845CountofInterestingSubarrays {
 public static void main(String[] args) {
    int[] nums = {3,1,9,6};
    int modulo = 3, k = 0;
    System.out.println(countInterestingSubarrays(null, modulo, k));
 }   
public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) 
    {
        // Step 1 : Initialize result, prefix sum, and a map with base case
        long result = 0;
        int prefix = 0;
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);

        // Step 2 : Traverse through nums
        for (int num : nums) 
        {
            // Step 3 : Check condition and update prefix
            if (num % modulo == k) 
            {
                prefix++;
            }

            // Step 4 : Calculate current prefix mod and target
            int mod = prefix % modulo;
            int target = (mod - k + modulo) % modulo;

            // Step 5 : Add to result and update map
            result += map.getOrDefault(target, 0L);
            map.put(mod, map.getOrDefault(mod, 0L) + 1);
        }

        // Step 6 : Return final count
        return result;
    }
}
