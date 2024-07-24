package JulyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2191. [Medium] Sort the Jumbled Numbers
public class SorttheJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};
        int[] ans =  sortJumbled(mapping, nums);
        for(int i : ans){
            System.out.println(i + " ");
        }
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> numberMapping = new HashMap<>();

        for (int num : nums) {
            if (!numberMapping.containsKey(num)) {
                numberMapping.put(num, translateInteger(num, mapping));
            }
        }

        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsBoxed, (a, b) -> Integer.compare(numberMapping.get(a), numberMapping.get(b)));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsBoxed[i];
        }

        return nums; 
    }

    private static int translateInteger(int num, int[] mapping) {
        char[] digits = Integer.toString(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) ('0' + mapping[digits[i] - '0']);
        }
        return Integer.parseInt(new String(digits));
    }
}
