package March2025Challenge;
/* 2529.[Easy] Maximum Count of Positive Integer and Negative Integer */
public class March12Problem2529MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int negCount = binarySearch(nums, 0);
      int posCount = nums.length - binarySearch(nums, 1);
      return Math.max(negCount, posCount);
  }
  private static int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1, result = nums.length;
    
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else {
            result = mid;
            right = mid - 1;
        }
    }
    
    return result;
}
}
