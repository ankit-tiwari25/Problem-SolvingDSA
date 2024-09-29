package BinarySearchQuestions;

/*
 * Observations / Learnings 
 * 1. Number of times array is rotated is equal to index of minimum element
 * 2. min ele should be strictly less than previous element and also it should be strictly less than next element.
 * 3. Calculating previous and next element. (checking edge cases)
 *    prev index = (mid + n - 1) % n;
 *    next index = (mid + 1) % n;
 * 4. Min index will always lies in unsorted half of array.
 * 
 */
public class NoOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 13, 15, 17, 2, 4, 7, 9};
        System.out.println(numberOfTimesArrayIsRotated(arr));
    }
    public static int numberOfTimesArrayIsRotated(int[] arr){
        int ans = 0;
        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                ans = mid;
                break;
            }
            if(arr[start] <= arr[mid]){
                start = mid ;
            }else if(arr[mid] <= arr[end]){
                end = mid;
            }
        }
        return ans;
    }
}
