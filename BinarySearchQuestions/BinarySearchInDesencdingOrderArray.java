package BinarySearchQuestions;

public class BinarySearchInDesencdingOrderArray {
    public static void main(String[] args) {
        int arr[] = {20, 18, 15, 14, 11, 9, 5, 3, 1};
        int ele = 11;
        System.out.println(binarySearchInDesencdingOrderArray(arr, ele));
    }
    public static int binarySearchInDesencdingOrderArray(int[] arr, int ele){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(ele == arr[mid]){
                ans = mid;
                break;
            }else if(ele > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
