
/* 3394. [Medium] Check if Grid can be Cut into Sections */

import java.util.Arrays;
/* 3394. [Medium] Check if Grid can be Cut into Sections */

public class March25Problem3394CheckifGridcanbeCutintoSections {
    public static void main(String[] args) {
        int n = 5;
        int[][] rectangles = {{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};
        System.out.println(checkValidCuts(n, rectangles));
    }
    public static boolean checkValidCuts(int n, int[][] rectangles) {
        int[][] xIntervals = new int[rectangles.length][2];
         int[][] yIntervals = new int[rectangles.length][2];
 
         for (int i = 0; i < rectangles.length; i++) {
             xIntervals[i][0] = rectangles[i][0];
             xIntervals[i][1] = rectangles[i][2];
             yIntervals[i][0] = rectangles[i][1];
             yIntervals[i][1] = rectangles[i][3];
         }
 
         return check(xIntervals) || check(yIntervals); 
     }

      private static boolean check(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int sections = 0;
        int maxEnd = intervals[0][1];

        for (int[] interval : intervals) {
            if (maxEnd <= interval[0]) {
                sections++;
            }
            maxEnd = Math.max(maxEnd, interval[1]);
        }

        return sections >= 2;
    }
}
