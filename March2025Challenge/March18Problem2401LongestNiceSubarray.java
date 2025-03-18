package March2025Challenge;

/* 2401.[Medium] Longest Nice Subarray */
public class March18Problem2401LongestNiceSubarray {
    public static void main(String[] args) {
        int[] nums = [1,3,8,48,10];
    }
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
          int maxLength = 1;
          int left = 0;
          int usedBits = 0;
          
          for (int right = 0; right < n; right++) {
              while ((usedBits & nums[right]) != 0) {
                  usedBits ^= nums[left];
                  left++;
              }
              
              usedBits |= nums[right];
              maxLength = Math.max(maxLength, right - left + 1);
          }
          
          return maxLength;   
      }
}
