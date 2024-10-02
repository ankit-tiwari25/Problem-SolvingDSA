package BinarySearchQuestions;

/*
 *  Given a sorted Array and a key.
 *  Find element which gives minimum  absolute difference with given key.
 *  
 *  Eg : arr[] = {1,  3, 8, 10, 15}  Key = 12
 *        diff    11, 9, 4,  2,  3      
 *       O/p = 10;  (gives minimum difference)
 *  
 */

public class FindMinimumDifferenceElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 12;
        System.out.println(findMinimumDifferenceElement(arr, key));
    }
    public static int findMinimumDifferenceElement(int arr[], int key){
        int res = Integer.MAX_VALUE;
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(key == arr[mid]){
                res = arr[mid];
                return res;
            }else if(key > arr[mid]){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        int diff1 = Integer.MAX_VALUE;
        if(arr[st] > key){
            diff1 = arr[st] - key;
        }else{
            diff1 = key - arr[st];
        }
        int diff2 = Integer.MAX_VALUE;
        if(arr[end] > key){
            diff2 = arr[end] - key;
        }else{
            diff2 = key - arr[end];
        }

        if(diff1 < diff2){
            res = arr[st];
        }else{
            res = arr[end];
        }
        return res;
    }
}
