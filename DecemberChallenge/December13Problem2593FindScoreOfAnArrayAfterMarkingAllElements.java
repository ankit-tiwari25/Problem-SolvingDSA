package DecemberChallenge;

import java.util.Arrays;

/*
 * 2593. [Medium] Find Score of an Array After Marking All Elements
 */
public class December13Problem2593FindScoreOfAnArrayAfterMarkingAllElements {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5,2};
        System.out.println(findScore(nums));
    }
     public static long findScore(int[] nums) {
          int n = nums.length;
        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }

        Arrays.sort(dp, (a, b) -> a[0] - b[0]);

        boolean[] marked = new boolean[n];
        long result = 0;

        for (int[] arr : dp) {
            int val = arr[0];
            int ind = arr[1];

            if (!marked[ind]) {
                result += val;

                marked[ind] = true;
                if (ind > 0)
                    marked[ind - 1] = true;
                if (ind < n - 1) 
                    marked[ind + 1] = true;
            }
        }

        return result;
    }
}
