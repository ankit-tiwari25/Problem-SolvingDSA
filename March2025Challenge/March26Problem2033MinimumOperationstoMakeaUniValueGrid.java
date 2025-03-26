/* 2033.[Medium] Minimum Operations to Make a Uni-Value Grid */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class March26Problem2033MinimumOperationstoMakeaUniValueGrid {
    public static void main(String[] args) {
        
    }
     public static int minOperations(int[][] grid, int x) {
        List<Integer> values = new ArrayList<>();
        
        for (int[] row : grid) {
            for (int val : row) {
                values.add(val);
            }
        }

        Collections.sort(values);

        for (int val : values) {
            if (Math.abs(val - values.get(0)) % x != 0) {
                return -1;
            }
        }

        int median = values.get(values.size() / 2);
        int operations = 0;

        for (int val : values) {
            operations += Math.abs(val - median) / x;
        }

        return operations; 
    }
}
