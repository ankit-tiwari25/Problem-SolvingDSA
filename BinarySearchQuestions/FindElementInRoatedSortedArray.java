package BinarySearchQuestions;
/*
 * Observations / Learnings / Approach
 * 1. We know how to calculate index of minimum element.
 * 2. We know how to search for an element in a sorted array.
 * 3. Once we'll get the index of minimum element, we can see that the array is divided into two sorted array.
 *    1. 0 - minIndex - 1
 *    2. minIndex -> arr.length
 */
public class FindElementInRoatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {11, 13, 17, 21, 2, 6, 9, 10};
        int ele = 9;
        System.out.println(findElementInRotatedSortedArray(arr, ele));
    }

    public static int findElementInRotatedSortedArray(int arr[], int ele){
        int minIndex = findMinimumElementIndex(arr);
        int firstHalf = binarySearch(arr, 0, minIndex - 1, ele);
        int secondHalf = binarySearch(arr, minIndex, arr.length - 1, ele);
        int ans = firstHalf;

        if(firstHalf == -1){
            ans = secondHalf;
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int start, int end, int ele){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(ele == arr[mid]){
                ans = mid;
                break;
            }else if(ele > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int findMinimumElementIndex(int[] arr){
        int ans = 0;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                ans = mid;
                break;
            }
            if(arr[start] <= arr[mid]){
                start = mid;
            }else if(arr[mid] < arr[end]){
                end = mid;
            }
        }
        return ans;
    }
}
