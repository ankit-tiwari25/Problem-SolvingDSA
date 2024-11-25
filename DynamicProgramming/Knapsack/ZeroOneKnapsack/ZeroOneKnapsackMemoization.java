package DynamicProgramming.Knapsack.ZeroOneKnapsack;

import java.util.Arrays;

public class ZeroOneKnapsackMemoization {
    public static int[][] t;
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        t = new int[n+1][W+1];
        for(int[] row : t){
            Arrays.fill(row, -1);
        }
        System.out.println("Max Profit : " + maxProfit(wt, val, W, n));

    }

    public static int maxProfit(int[] wt, int[] val, int W, int n){
        
        //Base condition
        if(n == 0 || W == 0){
            return 0;
        }

        if(t[n][W] != -1){
            return t[n][W];
        }

        if(wt[n-1] <= W){
            t[n][W] = Math.max(val[n-1] + maxProfit(wt, val, W-wt[n-1], n-1), maxProfit(wt, val, W, n-1));
            return t[n][W];
        }else{
            t[n][W] = maxProfit(wt, val, W, n-1);
            return t[n][W];
        }
        
    }
}
