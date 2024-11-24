package DynamicProgramming.Knapsack.ZeroOneKnapsack;

// Aditya Verma playlist
// 0-1 knapsack recursive approach
public class ZeroOneKnapsackRecursive {
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        System.out.println("Maximum profit : " + maxProfit(wt, val, W, n));
    }

    public static int maxProfit(int[] wt, int[] val, int W, int n){
        //Base condition, think of smallest valid input
        if(n == 0 || W == 0){
            return 0;
        }

        if(wt[n-1] <= W){
            return Math.max(val[n-1] + maxProfit(wt, val, W-wt[n-1], n-1), maxProfit(wt, val, W, n-1));
        }else{
            return maxProfit(wt, val, W, n-1);
        }
    }
}
