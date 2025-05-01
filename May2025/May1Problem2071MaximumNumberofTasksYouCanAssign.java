package May2025;

import java.util.TreeMap;

/* 2071.[Hard] Maximum Number of Tasks You Can Assign */
public class May1Problem2071MaximumNumberofTasksYouCanAssign {
     private void decrement(TreeMap<Integer, Integer> m, int k) {
        int c = m.get(k);
        if (c == 1) m.remove(k);
        else m.put(k, c - 1);
    }
}
