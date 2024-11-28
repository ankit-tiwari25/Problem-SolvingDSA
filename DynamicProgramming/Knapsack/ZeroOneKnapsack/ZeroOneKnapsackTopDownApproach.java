package DynamicProgramming.Knapsack.ZeroOneKnapsack;

/* Zero one knapsack Top down approach. (Iterative Approach) */
public class ZeroOneKnapsackTopDownApproach {
    public static int[][] t;
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;
        t = new int[n+1][W+1]; 
        System.out.println("Maximum profit : " + maxProfit(wt, val, W, n));
    }

    public static int maxProfit(int[] wt, int[] val, int W, int n){
        // Initialization
        for(int i = 0, j = 0; i < (n + 1); i++){
            t[i][j] = 0;
        }

        for(int j = 0, i = 0; j < (W + 1); j++){
            t[i][j] = 0;
        }


        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][W];
    }
}
