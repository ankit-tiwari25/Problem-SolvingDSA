/* 2302.[Hard] Count Subarrays With Score Less Than K */
public class April28Problem2302CountSubarraysWithScoreLessThanK {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,5};
        int k = 10;

        System.out.println(countSubarrays(nums, k));
    }
    public static long countSubarrays(int[] nums, long k) {
        int n = nums.length;
       
       long result = 0;
       long sum = 0;
       
       int i = 0;
       int j = 0;
       
       while (j < n) {
           sum += nums[j];
           
           while (i <= j && sum * (j - i + 1) >= k) {
               sum -= nums[i];
               i++;
           }
           
           result += (j - i + 1);
           j++;
       }
       
       return result;
   }
}
