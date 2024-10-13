package BinarySearchQuestions;
/*
 *  Given a bitonic array (monotonically increasing then decreasing) find max element.
 *  arr[] = {1, 3, 7, 12, 4, 2, 0};
 *  ans = 12;
 * 
 *   Approach : In short peak element nikalna hai...
 */
public class MaxElementInBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 12, 4, 2, 0};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr){
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(mid > 0 && mid < n - 1){
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    ans = mid;
                    break;
                }else if(arr[mid + 1] > arr[mid]){
                    // More promising side.. move right
                    start = mid + 1;
                    break;
                }else{
                    // Move left
                    end = mid - 1;
                }
            }else if(mid == 0){
                if(arr[mid] > arr[mid + 1]){
                    ans = mid;
                    break;
                }else{
                    ans = mid + 1;
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
        return arr[ans];
    }
}
