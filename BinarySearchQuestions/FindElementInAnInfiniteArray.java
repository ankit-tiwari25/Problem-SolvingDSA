package BinarySearchQuestions;
/*
 * NOTE :  Although it is not possible to create an infinite array on a coding platform but it is a good interview question.
 *   
 * Question : Infinitely sorted array de rakha hai.. also an element X.
 * Find position of X in a infinitely sorted array.
 *   
 * Eg :  ..... -6, -3, -1, 0 , 2, 5, 7, 9 ....
 *   X = 7.
 * O/p = Position of 7. (Here taking it as 6 by not consider left and right side ...)
 * 
 *   Solution / Approach 
 *  1. Take start = 0 but end kaise calculate kare?
 *  Solution: 
 *      Take start = 0;
 *           end = 1;
 *           jab tak ar[end] < X..
 *           start = end
 *           end = end * 2
 * 
 *  Fir start or end mil gye to binary search lag jayega
 *  
 *  
 */
public class FindElementInAnInfiniteArray {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 17, 19, 21, 26, 29};
       int X = 14;
       System.out.println(positionOfElementInAnInfinitelySortedArray(arr, X));
    }
    public static int positionOfElementInAnInfinitelySortedArray(int[] arr, int X){
        int res = -1;
        int start = 0;
        int end = 1;
        while(arr[end] < X){
            start = end;
            end = end * 2;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == X){
                res = mid;
                break;
            }else if(X > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
}
