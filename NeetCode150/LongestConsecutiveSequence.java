package NeetCode150;

import java.util.HashMap;
import java.util.Map;

/*
 * 128. [Medium] Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        // int[] nums = {100,4,200,1,3,2};
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("ans : " + longestConsecutive(nums));
    }
    public  static int longestConsecutive(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,0);
        }
        for(int i = 0; i < n; i++){
            int count = 0;
            int val = nums[i] + 1;
            // Moving + side
            while(map.containsKey(val) && map.get(val) == 0){
                count++;
                map.put(val, 1);
                val++;
            }
            //Moving - side
             val = nums[i] - 1;
            while(map.containsKey(val) && map.get(val) == 0){
                count++;
                map.put(val, 1);
                val--;
            }
            ans = Math.max(ans, count);
        }
        return ans+1;
    }
}
