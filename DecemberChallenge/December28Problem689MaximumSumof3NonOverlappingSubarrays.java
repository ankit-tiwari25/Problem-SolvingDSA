package DecemberChallenge;

/*
 *  689.[Hard] Maximum Sum of 3 Non-Overlapping Subarrays
 */
public class December28Problem689MaximumSumof3NonOverlappingSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,6,7,5,1};
        int k = 2;
        display(maxSumOfThreeSubarrays(nums, k));
    }
    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        if (nums == null || nums.length < k * 3)
            return new int[] {};

        int numSub = nums.length - k + 1;

        int[] subSum = new int[numSub];
        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += nums[i];

        subSum[0] = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            subSum[i - k + 1] = sum;
        }

        int[] maxAtLeft = new int[numSub];

        for (int i = 1; i < numSub; i++)
            maxAtLeft[i] = (subSum[i] > subSum[maxAtLeft[i - 1]]) ? i : maxAtLeft[i - 1];

        int[] maxAtRight = new int[numSub];
        maxAtRight[numSub - 1] = numSub - 1;

        for (int i = numSub - 2; i >= 0; i--)
            maxAtRight[i] = (subSum[i] >= subSum[maxAtRight[i + 1]]) ? i : maxAtRight[i + 1];

        int[] maxThree = new int[3];
        int maxSum = 0;
        for (int i = k; i < numSub - k; i++) {
            int curSum = subSum[maxAtLeft[i - k]] + subSum[i] + subSum[maxAtRight[i + k]];
            if (curSum > maxSum) {
                maxSum = curSum;
                maxThree = new int[] { maxAtLeft[i - k], i, maxAtRight[i + k] };
            }
        }
        return maxThree;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(" " + i);
        }
        System.out.println();
    }
}