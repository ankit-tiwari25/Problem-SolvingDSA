package BinarySearchQuestions;
/*
 *  Que : Ek array given hai..  or ek element given hai X.
 *   if X array me exists karta hai to return X. 
 *   Because Floor(X) = X and Ceil(X) = X. {Array k respect me!}
 *    Floor(X) = Greatest element smaller than X.
 *   if X array me exists nahi karta.. then return floor(X).
 *    Eg: 
 *        X = 5.
 *       O/P = 4 {Element btana hai}
 *        Floor(X) = 4.
 *          
 *      
 */
public class FindFloorOfAnElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 8, 10, 10, 10, 12, 14};
        int X = 11;
        System.out.println(floorOfAnElement(arr, X));

    }
    public static int floorOfAnElement(int[] arr, int X){
        int res = X;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == X){
                res = X;
                break;
            }else if(arr[mid] > X){
                // Move Left
                end = mid - 1;
            }else if(arr[mid] < X){
                // Can be a possible answer, also continue to move right.
                res = arr[mid];
                start = mid + 1;
            }
        }
        return res;
    }
}
