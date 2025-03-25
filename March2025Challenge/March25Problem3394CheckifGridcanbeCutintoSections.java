
/* 3394. [Medium] Check if Grid can be Cut into Sections */
public class March25Problem3394CheckifGridcanbeCutintoSections {
    public static void main(String[] args) {
        
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
}
