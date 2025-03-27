
/* 2780.[Medium] Minimum Index of a Valid Split */

import java.util.Arrays;
import java.util.List;

public class March27Problem2780MinimumIndexofaValidSplit {
    public static void main(String[] args) {
        Integer[] n = {1,2,2,2};
        List<Integer> nums = Arrays.asList(n);
        System.out.println(minimumIndex(nums));
    }
    public static int minimumIndex(List<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0)
                max = list.get(i);
            if (max == list.get(i))
                count++;
            else
                count--;
        }
        count = 0;
        for (int num : list) {
            if (num == max)
                count++;
        }
        if (count <= (n - count) + 1)
            return -1;

        count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == max)
                count++;
            else
                count--;
            if (count == 1)
                return i;
        }
        return -1;
    }
}
