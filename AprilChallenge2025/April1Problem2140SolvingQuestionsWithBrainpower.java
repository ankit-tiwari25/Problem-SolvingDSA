package AprilChallenge2025;

import java.util.Arrays;

/* 2140.[Medium] Solving Questions With Brainpower */
public class April1Problem2140SolvingQuestionsWithBrainpower {
    public static void main(String[] args) {
        
    }
    public long mostPoints(int[][] questions) {
         int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp,-1);
        return rec(0,questions,dp,n); 
    }
}
