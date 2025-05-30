
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* 2033.[Medium] Minimum Operations to Make a Uni-Value Grid */
public class March26Problem2033MinimumOperationstoMakeaUniValueGrid {
    public static void main(String[] args) {
        int[][] grid = {{2,4},{6,8}};
        int x = 2;
        System.out.println(minOperations(grid, x));
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
