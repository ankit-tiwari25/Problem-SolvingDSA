/* 2962. [Medium] Count Subarrays Where Max Element Appears at Least K Times */
public class April29Problem2962CountSubarraysWhereMaxElementAppearsatLeastKTimes {
    public static void main(String[] args) {
        
    }
    public long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
         for (int num : nums) maxi = Math.max(maxi, num);
         int left = 0;
         long maxiOccurence = 0;
         long res = 0;
         for (int right = 0; right < nums.length; right++) {
             if (nums[right] == maxi) maxiOccurence++;
             while (maxiOccurence >= k) {
                 if (nums[left] == maxi) maxiOccurence--;
                 left++;
             }
             res += left;
         }
         return res;   
     }
}
