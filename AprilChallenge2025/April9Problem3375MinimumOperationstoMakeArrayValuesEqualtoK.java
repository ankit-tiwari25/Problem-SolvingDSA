package AprilChallenge2025;

import java.util.Arrays;

/* 3375.[Easy] Minimum Operations to Make Array Values Equal to K */
public class April9Problem3375MinimumOperationstoMakeArrayValuesEqualtoK {
    public static void main(String[] args) {
        int[]  nums = {5,2,5,4,5};
        int k = 2;
        System.out.println(minOperations(nums, k));
    }
    public static int minOperations(int[] nums, int k) {
       Arrays.sort(nums);
        int mini = nums[0];
        if (mini < k) return -1;

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                cnt++;
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) 
                    i++;
            }
        }
        return cnt;  
    }
}
