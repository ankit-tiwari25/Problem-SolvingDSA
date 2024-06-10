package JuneChallenge;

import java.util.HashSet;
import java.util.Set;

// 217. [Easy] Contains Duplicate
// 
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            set.add(i);
        }

        
        return (nums.length != set.size());
    }
}
