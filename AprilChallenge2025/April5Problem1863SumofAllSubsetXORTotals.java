package AprilChallenge2025;
/* 1863.[Easy] Sum of All Subset XOR Totals */
public class April5Problem1863SumofAllSubsetXORTotals {
    public static void main(String[] args) {
        int[] nums = {1,3};
    }
    public static int subsetXORSum(int[] nums) {
        int total = 0;
         for (int num : nums) {
             total |= num;  // Step 1: Compute bitwise OR of all numbers
         }
         return total * (1 << (nums.length - 1));  
     }
}
