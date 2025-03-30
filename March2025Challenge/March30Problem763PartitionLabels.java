/* 763.[Medium] Partition Labels */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class March30Problem763PartitionLabels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
    }
     public static List<Integer> partitionLabels(String s) {
         Map<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastOccurrence.get(s.charAt(i)));
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}
