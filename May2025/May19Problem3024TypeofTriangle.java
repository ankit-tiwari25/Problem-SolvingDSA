/* 3024.[Easy] Type of Triangle */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class May19Problem3024TypeofTriangle {
    public static void main(String[] args) {
        
    }
    public static String triangleType(int[] nums) {
       Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (set.size() == 1) return "equilateral";
        if (set.size() == 2) return "isosceles";
        return "scalene";  
    }
}
