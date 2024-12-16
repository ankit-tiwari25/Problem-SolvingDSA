package DecemberChallenge;
/*
 * 3264.[Medium] Final Array State After K Multiplication Operations I
 */
public class Dcember16Problem3264FinalArrayStateAfterKMultiplicationOperations_I {
    public static void main(String[] args) {
       int[] nums = {2,1,3,5,6};
       int k = 5;
       int multiplier = 2;

       display(getFinalState(nums, k, multiplier));
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr = new int[2];

       for (int i = 0; i < k; i++) {
           arr = getMin(nums);
           nums[arr[1]] = arr[0] * multiplier;
       }

       return nums;
   }
    private static int[] getMin(int[] nums) {
       int min = Integer.MAX_VALUE;
       int idx = 0;

       for (int i = 0; i < nums.length; i++)
           if (nums[i] < min) {
               min = nums[i];
               idx = i;
           }

       return new int[] { min, idx };
   }
   public static void display(int[] arr){
    for(int i : arr){
        System.out.print(i + " ");
    }
    System.out.println();
   }
}
