package AprilChallenge2025;

import java.util.Arrays;

/* 2140.[Medium] Solving Questions With Brainpower */
public class April1Problem2140SolvingQuestionsWithBrainpower {
    public static void main(String[] args) {
        
    }
    public static long mostPoints(int[][] questions) {
         int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp,-1);
        return rec(0,questions,dp,n); 
    }
    private static long rec(int i,int[][] questions,long[] dp,int n)
    {
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        long take = questions[i][0] + rec(i+questions[i][1]+1,questions,dp,n);
        long dont = rec(i+1,questions,dp,n);

        return dp[i] = Math.max(take,dont);

    }
}
