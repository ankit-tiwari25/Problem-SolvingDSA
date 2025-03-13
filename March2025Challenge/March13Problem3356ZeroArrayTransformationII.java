package March2025Challenge;

import java.util.Arrays;

/* 3356.[Medium] Zero Array Transformation II */
public class March13Problem3356ZeroArrayTransformationII {
    public static void main(String[] args) {
        
    }
     public static int minZeroArray(int[] nums, int[][] queries) {
         int n = nums.length;
        
        if (Arrays.stream(nums).allMatch(x -> x == 0)) return 0;
        int left = 1, right = queries.length;
        if (!canMakeZeroArray(right, nums, queries)) return -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeZeroArray(mid, nums, queries)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
