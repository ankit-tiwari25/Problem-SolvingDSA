package JulyChallenge;

import java.util.Arrays;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        int[] ans = frequencySort(nums);
        System.out.println(ans);
        
    }
        public static int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        for (int num : nums) {
            count[num + 100]++;
        }
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, (a, b) -> {
            if (count[a + 100] == count[b + 100]) {
                return b - a;
            }
            return count[a + 100] - count[b + 100];
        });
        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();
}
}
