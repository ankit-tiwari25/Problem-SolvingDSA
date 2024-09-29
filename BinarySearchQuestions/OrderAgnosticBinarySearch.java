package BinarySearchQuestions;
/*
 * Sorted order of array not known earlier!
 */
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int incOrderArray[] = {20, 17, 15, 14, 11, 9, 6, 4, 3, 1};
        int desOrderArray[] = {1, 3,  4, 6, 9, 11, 14, 15, 19, 20};
        int ele = 15;

        orderAgnosticBinarySearch(incOrderArray, ele);
        orderAgnosticBinarySearch(desOrderArray, ele);
    }
    public static void orderAgnosticBinarySearch(int[] arr, int ele){
        if(arr.length == 1){
            if(arr[0] == ele){
                System.out.println("0");
            }
        }else{
            if(arr[0] < arr[arr.length - 1]){
                System.out.println(ascendingOrderBinarySearch(arr, ele));
            }else{
                System.out.println(descendingOrderBinarySearch(arr, ele));
            }
        }
    }
    public static int ascendingOrderBinarySearch(int arr[], int ele){
        int n = arr.length;
        int start = 0;
        int end = n;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

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
    public static int descendingOrderBinarySearch(int[] arr, int ele){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(ele == arr[mid]){
                ans = mid;
                break;
            }else if(ele > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;

    }
}
