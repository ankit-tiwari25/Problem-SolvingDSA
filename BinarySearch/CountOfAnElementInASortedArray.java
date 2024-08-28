package BinarySearch;
/*
Playlist : Aditya Verma (Video 6)
 * Number of time an element is repeated in a sorted array.
 */
public class CountOfAnElementInASortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,10,10,10,10,10,18,18,18,20};
        int key = 18;
        System.out.println(countOfAnElementInASortedArray(arr, key));
    }
    public static int countOfAnElementInASortedArray(int[] arr, int key){
        int ans = -1;

        int leftIndex = firstIndex(arr, key);
        int rightIndex = lastIndex(arr, key);

        if(leftIndex != -1 && rightIndex != -1){
            ans = rightIndex - leftIndex + 1;
        }
        return ans;
    }
    public static int firstIndex(int[] arr, int key){
        int ans = -1;
        int l = 0;
        int h = arr.length - 1;
        int mid = l + (h - l)/2;

        while(l <= h){
             mid = l + (h - l)/2;
            if(arr[mid] == key){
                ans = mid;
                h = mid - 1;
            }else if(key < arr[mid]){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int lastIndex(int[] arr, int key){
        int ans = -1;
        int i = 0;
        int j = arr.length - 1;
        int mid = -1;
        while(i <= j){
             mid = i + ( j - i)/ 2;
             if(key == arr[mid]){
                ans = mid;
                i = mid + 1;
             }else if(key < arr[mid]){
                j = mid - 1;
             }else{
                i = mid + 1;
             }
        }
        return ans;
    }
}
