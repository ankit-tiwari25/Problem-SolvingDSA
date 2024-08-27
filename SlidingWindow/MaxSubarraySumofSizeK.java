package SlidingWindow;
// Playlist - Aditya verma 
//Question 1 : Maximum subarray sum of size k
/*
 * 
 */
public class MaxSubarraySumofSizeK {
   public static void main(String[] args) {
    int arr[] = {2,-5,1,8,-2,9,1};
    int k = 3;
    System.out.println(maxSubarraySumofSizeK(arr, k));
   }
   public static int maxSubarraySumofSizeK(int[] arr, int k){
    int maxSum = Integer.MIN_VALUE;
    int n = arr.length;
    int i = 0, j = 0;
    int sum = 0;

    
    while( j < n){
        sum = sum + arr[j];

        if((j - i + 1) < k){
            j++;
        }else if((j - i + 1) == k){
            maxSum = Math.max(sum,maxSum);
            
            sum = sum - arr[i];
            i++;
            j++;
        }
    }
    return maxSum;
   }
}
