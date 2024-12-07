package DecemberChallenge;

import java.util.Arrays;
/*
 * 1760. [Medium] Minimum Limit of Balls in a Bag
 */
public class December7Problem1760MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
       int[] nums = {9};
       int maxOperations = 2; 
       System.out.println(minimumSize(nums, maxOperations));
    }
    public static int minimumSize(int[] nums, int maxOps) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        while (low < high) {
            int mid = (low + high) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += (n - 1) / mid;
            }
            if (ops <= maxOps) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}
