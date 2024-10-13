package BinarySearchQuestions;
/*
 * Given a bitonic array and a key. Find index of key element. 
 *  arr[] = {1, 5, 18, 21, 19, 14, 8, 2};
 *  Key = 18;
 *  O/P = 2;
 *  Key = 20;
 *  O/P = -1;
 * 
 * Approach : 
 * 1. Find peak element. 
 * 2. Divide given array from peak element. 
 * 3. Apply Binary Search : Find key in first half(monotonically increasing array)
 * 4. Apply Binary Search : Find key in second half(monotonically decreasing array)
 * 5. if(both returns -1).. return -1;
 */
public class FindKeyInBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 18, 21, 19, 14, 8, 2};
        int key = 8;
        System.out.println(findKeyInBitonicArray(arr, key));
    }
    public static int findKeyInBitonicArray(int[] arr, int key){
        int ans = -1;

        int peakElementIndex = findPeakElement(arr);
        int firstHalf = binarySearchInIncreasingArray(arr, 0, peakElementIndex, key);

        if(firstHalf != -1){
            ans = firstHalf;
            return ans;
        }
        int secondHalf = binarySearchInDecreasingArray(arr, peakElementIndex + 1, arr.length - 1, key);
        ans = secondHalf;
        
        return ans;
    }
    public static int findPeakElement(int[] arr){
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid > 0 && mid < n - 1){
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    ans = mid;
                    break;
                }else if(arr[mid + 1] > arr[mid]){
                    // More prosmising side.. move right
                    start = mid + 1;
                }else{
                    // Move left
                    end = mid - 1;
                }
            }else if(mid == 0){
                if(arr[mid] > arr[mid + 1]){
                    ans = mid;
                    break;
                }else{
                    ans = mid + 1;
                    break;
                }
            }else if(mid == n - 1){
                if(arr[mid] > arr[mid - 1]){
                    ans = mid;
                    break;
                }else{
                    ans = mid - 1;
                    break;
                }
            }
        }
        return ans;
    }
    public static int binarySearchInIncreasingArray(int[] arr, int start, int end, int key){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == key){
                ans = mid;
                break;
            }else if(key > arr[mid]){
                // Move right
                start = mid + 1;
            }else{
                //Move left
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int binarySearchInDecreasingArray(int[] arr, int start, int end, int key){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key == arr[mid]){
                ans = mid;
                break;
            }else if(key > arr[mid]){
                //Since it is decreasing array.. move left
                end = mid - 1;
                break;
            }else{
                // Move right
                start = mid + 1;
            }
        }
        return ans;
    }
}
