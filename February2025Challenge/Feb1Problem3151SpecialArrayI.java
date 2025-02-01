package February2025Challenge;
/* 3151.[Easy] Special Array I */
public class Feb1Problem3151SpecialArrayI {
    public static void main(String[] args) {
        
    }
    public static boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
         if (nums[i] % 2 == nums[i + 1] % 2) {
             return false;
         }
     }
     return true;
 }
}
