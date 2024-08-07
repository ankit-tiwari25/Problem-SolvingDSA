package JulyChallenge;

import java.util.Arrays;
// 1509. [Medium] Minimum Difference Between Largest and Smallest Value in Three Moves
//Matchematics
public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {
    public static void main(String[] args) {
        int[] nums = {5,3,2,4};
        System.out.println(minDifference(nums));

    }
     public static int minDifference(int[] nums) {
     if(nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[nums.length - 1] - nums[0];
        for(int i = 0; i <= 3; i++) {
            ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
        }
        return ans;   
    }
}
