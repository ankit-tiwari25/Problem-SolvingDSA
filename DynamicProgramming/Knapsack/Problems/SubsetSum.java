package DynamicProgramming.Knapsack.Problems;

/*
 * Subset Sum Problem
 * Que : array given hai along with sum. Check karna hai ki array me aisa subset present hai kya jiska sum given sum k equal hai.
 * Eg : arr[] = {2, 3, 7, 8, 10}
 *      sum = 11;
 * 
 * o/p : True. (3,8)
 * 
 */
public class SubsetSum {

    public static boolean[][] t;
    public static void main(String[] args) {
         int[] arr = {2, 3, 7, 8};
        int sum = 5;
        int n = arr.length;
        t = new boolean[n+1][sum+1];
        boolean ans = subsetSum(arr, sum, n);
        System.out.println("Subset Sum possible : "+ ans);
    }

    public static boolean subsetSum(int[] arr, int sum, int n){

        //Initialization
        // n = 1, sum = 0.. possible with empty subset
        for(int i = 0, j = 0; i < n+1; i++){
            t[i][j] = true;
        }

        // for n = 0, sum = 0 is possible that's why j started from 1
        // n = 0, sum = 1.. not possible
        for(int i = 0, j = 1; j <(sum + 1); j++){
            t[i][j] = false;
        }

        for(int i = 1; i < (n+1); i++){
            for(int j = 1; j < (sum + 1); j++){
                if(arr[i-1] < j){
                    t[i][j] = t[i=1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
