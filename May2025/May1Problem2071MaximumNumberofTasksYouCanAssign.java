package May2025;

import java.util.Arrays;
import java.util.TreeMap;

/* 2071.[Hard] Maximum Number of Tasks You Can Assign */
public class May1Problem2071MaximumNumberofTasksYouCanAssign {
    public static void main(String[] args) {
        int[] tasks = {3,2,1};
        int[] workers = {0,3,3};
        int pills = 1, strength = 1;
        System.out.println(maxTaskAssign(tasks, workers, pills, strength));
    }
     private static void decrement(TreeMap<Integer, Integer> m, int k) {
        int c = m.get(k);
        if (c == 1) m.remove(k);
        else m.put(k, c - 1);
    }
    public static int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
       int left = 0, right = Math.min(tasks.length, workers.length);
        Arrays.sort(tasks);
        Arrays.sort(workers);

        while (left < right) {
            int mid = (left + right + 1) / 2;
            int usedPills = 0;
            TreeMap<Integer, Integer> avail = new TreeMap<>();
            for (int i = workers.length - mid; i < workers.length; ++i)
                avail.put(workers[i], avail.getOrDefault(workers[i], 0) + 1);

            boolean canAssign = true;
            for (int i = mid - 1; i >= 0; --i) {
                int t = tasks[i];
                int w = avail.lastKey();
                if (w >= t) {
                    decrement(avail, w);
                } else {
                    Integer key = avail.ceilingKey(t - strength);
                    if (key == null || ++usedPills > pills) {
                        canAssign = false;
                        break;
                    }
                    decrement(avail, key);
                }
            }

            if (canAssign)
                left = mid;
            else
                right = mid - 1;
        }

        return left;  
    }
}
