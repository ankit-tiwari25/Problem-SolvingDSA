package BinarySearch;
/*
 * Find element in a nearly sorted array
 */
public class FindElementInNearlySortedArray {
    public static void main(String[] args) {
        int arr[] = {5,10,30,20,40};
        int key = 20 ;
        System.out.println(findElementInNearlySortedArray(arr, key));
    }
    public static int findElementInNearlySortedArray(int[] arr, int key){
        int st = 0;
        int n = arr.length;
        int end = n -1;
        int mid = st + (end - st)/2;
        int ans = mid;

        while(st <= end){
             mid = st + (end - st) / 2;
            if(arr[mid] == key){
                ans = mid;
                break;
            }else if(mid - 1 >= st && key == arr[mid - 1]){
                ans = mid - 1;
                break;
            }else if(mid + 1 <= end && key == arr[mid + 1]){
                ans = mid + 1;
                break;
            }else if(key < arr[mid]){
                end = mid - 2;
            }else{
                st = mid + 2;
            }
            
        }
        return ans;
    }
}
