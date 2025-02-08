package February2025Challenge;

/* 2349.[Medium] Design a Number Container System */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Feb8Problem2349DesignaNumberContainerSystem {
      private static Map<Integer, PriorityQueue<Integer>> res;
    private static Map<Integer, Integer> index_val;

    public static void main(String[] args) {
        
    }
     public Feb8Problem2349DesignaNumberContainerSystem() {
        res = new HashMap<>();
        index_val = new HashMap<>();
    }
    public static void change(int index, int number) {
        if (index_val.containsKey(index)) {
            int prevNum = index_val.get(index);
            if (prevNum == number) return;
            res.get(prevNum).remove(index);
        }

        res.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        index_val.put(index, number);
    }
    public static int find(int number) {
        PriorityQueue<Integer> pq = res.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
