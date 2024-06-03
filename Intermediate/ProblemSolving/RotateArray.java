package ProblemSolving;
/*
 * Given N array elements Rotate array from last to
first anticlockwise by k times. 
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,6,9,8};
        int k = 3;
        display(arr);
        int ans[] = rotateArray(arr, k);
        display(ans);
    }
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        return arr;
    }

    public static void reverseArray(int[] arr, int start, int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
    }
}
