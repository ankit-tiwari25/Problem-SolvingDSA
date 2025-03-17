package March2025Challenge;

import java.util.Arrays;

/* 2206.[Easy] Divide Array Into Equal Pairs */
public class March17Problem2206DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        
    }
    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) return false;
        }
        return true; 
    }
}
