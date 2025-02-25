/* 1524.[Medium] Number of Sub-arrays With Odd Sum */
public class Feb25Problem1524NumberofSubarraysWithOddSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }
    public static int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
       int n = arr.length;
       int oddCount = 0, evenCount = 1; // Initialize counts for subarrays with odd and even sums
       int totalSum = 0, subArraysWithOddSum = 0; // Initialize the total sum and the result counter

       for (int i = 0; i < n; i++) {
           totalSum += arr[i]; 
           if (totalSum % 2 == 0) {
               evenCount++; 
               // Add the count of subarrays with odd sums ending at previous indices
               subArraysWithOddSum = (subArraysWithOddSum + oddCount) % MOD;
           } else {
               oddCount++;
               // Add the count of subarrays with even sums ending at previous indices
               subArraysWithOddSum = (subArraysWithOddSum + evenCount) % MOD;
           }
       }
       return subArraysWithOddSum;  
   }
}
