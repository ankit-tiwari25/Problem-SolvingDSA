package March2025Challenge;
/* 2529.[Easy] Maximum Count of Positive Integer and Negative Integer */
public class March12Problem2529MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args) {
        
    }
    public static int maximumCount(int[] nums) {
        int negCount = binarySearch(nums, 0);
      int posCount = nums.length - binarySearch(nums, 1);
      return Math.max(negCount, posCount);
  }
}
