package DecemberChallenge;
/*2779. [Medium] Maximum Beauty of an Array After Applying Operation */
public class December11Problem2779MaximumBeautyOfAnArrayAfterApplyingOperation {
    public static void main(String[] args) {
       int nums[] = {4,6,1,2};
       int k = 2;
       System.out.println(maximumBeauty(nums, k));
    }
    public static int maximumBeauty(int[] nums, int k) {
        if (nums.length == 1)
           return 1;

       int maxBeauty = 0;
       int maxValue = 0;

       for (int num : nums)
           maxValue = Math.max(maxValue, num);

       int[] count = new int[maxValue + 1];

       for (int num : nums) {
           count[Math.max(num - k, 0)]++;
           count[Math.min(num + k + 1, maxValue)]--;
       }

       int currentSum = 0;

       for (int val : count) {
           currentSum += val;
           maxBeauty = Math.max(maxBeauty, currentSum);
       }

       return maxBeauty;
   }
}
