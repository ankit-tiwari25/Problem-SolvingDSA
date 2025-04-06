package AprilChallenge2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 368.[Medium] Largest Divisible Subset */
public class April6Problem368LargestDivisibleSubset {
    public static void main(String[] args) {
        
    }
     public static List<Integer> largestDivisibleSubset(int[] nums) {
       Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxi = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxi]) maxi = i;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = maxi; i >= 0; i = prev[i]) {
            res.add(nums[i]);
        }
        return res;  
    }
}
