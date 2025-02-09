package February2025Challenge;

import java.util.HashMap;
import java.util.Map;

/* 2364.[Medium] Count Number of Bad Pairs  */
public class Feb9Problem2364CountNumberofBadPairs {
    public static void main(String[] args) {
        
    }
    public static long countBadPairs(int[] nums) {
        Map<Integer, Integer> bag = new HashMap<>();
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += -1 + bag.merge(nums[i] - i, 1, Integer::sum);
        }
        int len = nums.length;
        return 1L * len * (len - 1) / 2 - count; 
    }
}
