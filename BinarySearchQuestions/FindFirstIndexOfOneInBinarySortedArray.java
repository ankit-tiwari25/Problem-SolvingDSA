package BinarySearchQuestions;

/*
 *  Given Infinite binary sorted array. Find index of first one.
 *  Simple hai.. first since it is infinite array.. check for st and end index.
 *  Second. Find first Occurence of an element wala similar question. Here element is 1.
 */

public class FindFirstIndexOfOneInBinarySortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        System.out.println(findFirstIndexOfOneFromInfinitelyBinarySortedArray(arr));
    }
    public static int findFirstIndexOfOneFromInfinitelyBinarySortedArray(int[] arr){
        // Since it is an infinite array.. calculate first and last index
        int st = 0;
        int end = 1;
        while(arr[end] != 1){
            st = end;
            end = end * 2;
        }
        int res = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == 1){
                // Can be a possible ans but continue moving left
                res = mid;
                end = mid - 1;
            }else if (arr[mid] < 1){
                st = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return res;
    }
}
