package BinarySearchQuestions;

public class FirstAndLastOccurenceOfAnElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 5, 7, 9, 15};
        int ele = 5;
        System.out.println("First Occurence : " + firstOccurence(arr, ele));
        System.out.println("Last Occurence : " + lastOccurence(arr, ele));
    }
    public static int firstOccurence(int[] arr, int ele){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            
            if(ele == arr[mid]){
                //possible ans but still move left
                ans = mid;
                end = mid - 1;
            }else if(ele > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }
    public static int lastOccurence(int[] arr, int ele){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(ele == arr[mid]){
                // possible ans but still move right
                ans = mid;
                start = mid + 1;
            }else if(ele > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
