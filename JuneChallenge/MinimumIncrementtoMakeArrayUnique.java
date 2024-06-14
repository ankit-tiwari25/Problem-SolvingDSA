package JuneChallenge;

import java.util.Arrays;

// 945. [Medium] Minimum Increment to Make Array Unique
//14th June 2024
// Must do
public class MinimumIncrementtoMakeArrayUnique {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int numTracker = 0; // Tracks the next unique number that should be set.
        int minIncrement = 0; // Counts the total increments required.

        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            minIncrement += numTracker - num;
            numTracker += 1; // Increment the tracker for the next number.
        }

        return minIncrement;
    }
}
