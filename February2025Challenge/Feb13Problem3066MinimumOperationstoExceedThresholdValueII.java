/* 3066.[Medium] Minimum Operations to Exceed Threshold Value II */

import java.util.PriorityQueue;

public class Feb13Problem3066MinimumOperationstoExceedThresholdValueII {
    public static void main(String[] args) {
        
    }
     public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (num < k) pq.add(num);
        }

        int operations = 0;

        while (!pq.isEmpty()) {
            int x = pq.poll();
            operations++;

            if (pq.isEmpty()) break;

            int y = pq.poll();
            long newValue = 2L * x + y;

            if (newValue < k) pq.add((int) newValue);
        }

        return operations;
    }
}
