package BinarySearch;
/*
 *  Find element in rotated sorted array
 */
public class FindElementInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {11, 14, 18, 21, 2, 5, 8, 9, 10};
        int key = 21;
        System.out.println(findElementInRotatedSortedArray(arr, key));
    }
    public static int findElementInRotatedSortedArray(int[] arr, int key){
        int minIndex = findMinIndex(arr);
        int left = binarySearch(arr, 0, minIndex - 1, key);
        int right = binarySearch(arr, minIndex, arr.length - 1, key);

        int ans = -1;
        if(left != -1){
            ans = left;
        }else if(right != -1){
            ans = right;
        }else{
            ans = -1;
        }
        return ans;
    }
    public static int findMinIndex(int[] arr){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int mid = st + (end - st)/2;
        int ans = mid;

        while(st <= end){
             mid = st + (end - st)/2;
             int prev = (mid + n - 1) % n;
             int next = (mid + 1) % n;

             if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                ans = mid;
                break;
             }
             if(arr[st] <= arr[mid]){
                end = mid + 1;
             }else if(arr[mid] <= arr[end]){
                st = mid - 1;
             }
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int start, int end, int key){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == key){
                ans = mid;
                break;
            }else if(key < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

}
