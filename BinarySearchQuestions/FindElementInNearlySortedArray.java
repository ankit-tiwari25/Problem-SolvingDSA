package BinarySearchQuestions;
/*
 *  Nearly sorted array means, jo element idealy ith position pe hona chaiye tha, vo (i-1), (i),(i+1)
 *  position pe exists kar sakta hai..
 * Eg :          arr[] = {5 , 10, 30, 20, 40}  X = 20.
 *              o/p = 3
 *  Approach : 
 *    Sorted arr[] = {5 , 10, 20, 30, 40} 
 *    ele ko arr[mid], arr[mid - 1] and arr[mid + 1] se compare karenge.
 *    Also check for segmentation fault. (Array index out of bound exception)
 * 
 *      
 */
public class FindElementInNearlySortedArray {
    public static void main(String[] args) {
        int arr[] = {5 , 10, 30, 20, 40};
        int X = 20;
        System.out.println(findElemetInNearlySortedArray(arr, X));
    }

    public static int findElemetInNearlySortedArray(int[] arr, int X){
        int res = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(X == arr[mid]){
                res = mid;
                break;
            }
            if(mid - 1 >= start && X == arr[mid - 1]){
                res = mid - 1;
                break;
            }
            if(mid + 1 <= end && X == arr[mid + 1]){
                res = mid + 1;
                break;
            }
            if(X > arr[mid + 1]){
                start = mid + 2;
            }else if(X < arr[mid - 1]){
                end = mid - 2;
            }
        }
        return res;
    }
}
