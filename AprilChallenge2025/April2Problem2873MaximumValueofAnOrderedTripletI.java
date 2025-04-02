package AprilChallenge2025;
/* 2873.[Easy] Maximum Value of an Ordered Triplet I */
public class April2Problem2873MaximumValueofAnOrderedTripletI {
    public static void main(String[] args) {
       int[] nums = {12,6,1,2,7};
       System.out.println(maximumTripletValue(nums));
    }
    public static long maximumTripletValue(int[] nums) {
        long maxTriplet = 0;
       for (int i = 0; i < nums.length; i++) {
           for (int k = nums.length - 1; k > i; k--) {
               int j = i + 1;
               while (j < k) {
                   maxTriplet = Math.max(maxTriplet, (long)(nums[i] - nums[j]) * nums[k]);
                   j++;
               }
           }
       }
       return Math.max(0, maxTriplet); 
   }
}
