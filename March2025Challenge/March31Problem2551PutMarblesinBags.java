/* 2551.[Hard] Put Marbles in Bags */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class March31Problem2551PutMarblesinBags {
    public static void main(String[] args) {
        
    }
      public long putMarbles(int[] weights, int k) {
      if (k == 1) {
            return 0;
        }

        List<Integer> pairSums = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            pairSums.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairSums);

        long minScore = 0, maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairSums.get(i);
            maxScore += pairSums.get(pairSums.size() - 1 - i);
        }

        return maxScore - minScore;  
    }
}
