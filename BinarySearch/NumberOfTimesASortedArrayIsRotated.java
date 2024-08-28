package BinarySearch;
/*
 * Number of times a sorted array is rotated...
 */
public class NumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int arr[] = {11, 14, 18, 21, 2, 5, 8, 9, 10 };
        System.out.println(numberOfTimesASortedArrayIsRotated(arr));
    }
    public static int numberOfTimesASortedArrayIsRotated(int[] arr){
        int ans = 0;
        int start = 0;
        int n = arr.length;
        int end = n - 1;

        int mid = start + (end - start)/2;
        while(start <= end){
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                ans = mid;
                break;
            }
            // Minimum element lies in unsorted array!
            if(arr[start] < arr[mid]){
                end = mid + 1;
            }else if(arr[mid] <= arr[end]){
                start = mid - 1;
            }
        }
        return ans;
    }
}
