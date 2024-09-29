package BinarySearchQuestions;

public class CountOfAnElementInASortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 5, 7, 9, 15};
        int ele = 5;
        System.out.println("Count = " + countOfElement(arr, ele));
    }
    public static int countOfElement(int[] arr, int ele){
        int firstIdx = firstOccurence(arr, ele);
        int lastIdx = lastOccurence(arr, ele);
        int count = 0;
        if(firstIdx != -1 || lastIdx != -1){
            count = lastIdx - firstIdx + 1;
        }
        return count;
    }
    public static int firstOccurence(int[] arr, int ele){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(ele == arr[mid]){
                // possible ans, continue to move left
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
                // possible ans, continue to move right
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
