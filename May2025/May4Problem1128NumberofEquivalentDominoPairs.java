package May2025;

import java.util.HashMap;
import java.util.Map;

/* 1128.[Easy] Number of Equivalent Domino Pairs */
public class May4Problem1128NumberofEquivalentDominoPairs {
    public static void main(String[] args) {
        
    }
    public static long cantorPair(int a, int b) {
        int x = Math.min(a, b), y = Math.max(a, b);
        long sum = x + y;
        return (sum * (sum + 1)) / 2 + y;
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<Long, Integer> freq = new HashMap<>();
        for (int[] dom : dominoes) {
            long pairValue = cantorPair(dom[0], dom[1]);
            count += freq.getOrDefault(pairValue, 0);
            freq.put(pairValue, freq.getOrDefault(pairValue, 0) + 1);
        }
        return count;
    }
}
