package BinarySearchQuestions;
/*
 *   Que : Ek array given hai..  or ek element given hai X.
 *   if X array me exists karta hai to return X. 
 *   Because Floor(X) = X and Ceil(X) = X. {Array k respect me!}
 *    Ceil(X) = Smallest element greater than X.
 *   if X array me exists nahi karta.. then return Ceil(X).
 *    Eg:  
 *       int arr[] = {1, 2, 3, 4, 8, 10, 10, 10, 12, 14};
 *       X = 11.
 *       O/P = 12 {Element btana hai}
 *       Ceil(X) = 12.
 */
public class FindCeilOfAnElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 8, 10, 10, 10, 12, 14};
        int X = 11;
        System.out.println(findCeilOfAnElement(arr, X));
    }
    public static int findCeilOfAnElement(int[] arr, int X){
        int res = X;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == X){
                res  = X;
                break;
            }else if(arr[mid] < X){
                // Move right
                start = mid + 1;
            }else if(arr[mid] > X){
                // Can be a possible ans, continue to move left
                res = arr[mid];
                end = mid - 1;
            }
        }
        return res;
    }
}
