package BinarySearchQuestions;
/*
 * Binary Search Playlist
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 9, 12, 14, 16, 21, 24};
        int ele = 9;
        System.out.println(binarySearch(arr, ele));    }
    public static int binarySearch(int[] arr, int ele){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end  - start)/2;

            if(ele == arr[mid]){
                ans = mid;
                break;
            }else if(arr[mid] < ele){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
