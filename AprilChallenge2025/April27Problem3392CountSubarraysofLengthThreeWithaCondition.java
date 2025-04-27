/* 3392.[Easy] Count Subarrays of Length Three With a Condition */
public class April27Problem3392CountSubarraysofLengthThreeWithaCondition {
    public static void main(String[] args) {
        
    }
    public int countSubarrays(int[] nums) {
        int count = 0;
       for (int i = 0; i + 2 < nums.length; i++) {
           if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
               count++;
           }
       }
       return count; 
   }
}
