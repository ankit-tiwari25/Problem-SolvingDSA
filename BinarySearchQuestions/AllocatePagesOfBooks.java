package BinarySearchQuestions;
/*
 * 410. Split Array Largest Sum 
 * Aditya Verma Binary Search Playlist... (last question)
 * 
 */
public class AllocatePagesOfBooks {
    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40};
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(allocatePagesOfBooks(arr, k));
    }

    public static int allocatePagesOfBooks(int[] arr, int k){
        int ans = -1;
        int n = arr.length;
        if(n < k){
            return ans;
        }

        int max = arr[0];
        int sum = arr[0];

        for(int i : arr){
            if(i > max){
                max = i;
            }
            sum = sum + i;
        } 

        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(arr, n, k, mid)){
                // mid is possible ans.. move left
                ans = mid;
                end = mid - 1;
            }else{
                //move right
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] arr, int n, int k, int max){
        if(n < k){
            return false;
        }

        int student = 1;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum > max){
                student ++;
                if(student > k){
                    return false;
                }
                sum = arr[i];
            }
        }
        return true;
    }
}
