package JuneChallenge;

import java.util.Arrays;
// 1051. [Easy] Height Checker
// 10th June 2024
// Look for optimized approach

public class HeightChecker {
    public static void main(String[] args) {
        int heights[] = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int expected[] = new int[n];

        for (int i = 0; i < n; i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        int count = 0;
        for(int i = 0; i < n; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}
