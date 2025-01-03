package January2025Challenge;

/* 2270.[Medium] Number of Ways to Split Array */
public class Jan3Problem2270NumberofWaystoSplitArray {
    public static void main(String[] args) {
        
    }
    public static int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
      for (int num : nums) {
          rightSum += num;
      }

      int validSplits = 0;
      for (int i = 0; i < nums.length - 1; i++) {
          leftSum += nums[i];
          rightSum -= nums[i];
          if (leftSum >= rightSum) {
              validSplits++;
          }
      }

      return validSplits; 
  }
}
