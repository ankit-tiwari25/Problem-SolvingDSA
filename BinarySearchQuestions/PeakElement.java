package BinarySearchQuestions;
/* 17. Find Peak Element in a given array. (Unsorted) 
 *  int arr[] = {5, 10, 25, 4};
 *  ans = 2 (Index of peak element)
 * 
*/
public class PeakElement {
    public static void main(String[] args) {
        // int[] arr = {5, 10, 25, 4};  // Peak in middle
        // int arr[] = {25, 7, 8, 9};   // Peak at 0 index
        int arr[] = {7, 8, 9 , 25};     // Peak at n-1 index
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr){
        int ans = -1;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid > 0 && mid < n - 1){
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    ans = mid;
                    break;
                }else if( arr[mid - 1] > arr[mid]){
                    // More promising side.. move left
                    end = mid - 1;
                }else{
                    // Move Right
                    start = mid + 1;
                }
            }else if(mid == 0){
                if(arr[1] > arr[0]){
                    ans = 1;
                    break;
                }else{
                    ans = 0;
                    break;
                }
            }else if(mid == n - 1){
                if(arr[mid] > arr[mid - 1]){
                    ans = mid;
                    break;
                }else{
                    ans = mid - 1;
                    break;
                }
            }
        }
        return ans;
    }
}
