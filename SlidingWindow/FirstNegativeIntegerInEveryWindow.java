package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

/*
 * Playlist : Aditya Verma
 * Question 2 : First Negative Integer in every window of size k
 */
public class FirstNegativeIntegerInEveryWindow {
    public static void main(String[] args) {
        int arr[]  = {12, -1, -7, 8, -16, 30, 20, 28};
        int k = 3;
        System.out.println(firstNegativeIntegerInEveryWindow(arr, k));
    }
    public static List<Integer> firstNegativeIntegerInEveryWindow(int[] arr, int k){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0, j = 0;
        List<Integer> negativeIntegers = new ArrayList<>();

        while(j < n){
            if(arr[j] < 0){
                negativeIntegers.add(arr[j]);
            }

            if((j - i + 1) < k){
                j++;
            }else if((j - i + 1) == k){
                if(negativeIntegers.size() == 0){
                    ans.add(0);
                }else{
                    ans.add(negativeIntegers.get(0));
                    if(arr[i] == negativeIntegers.get(0)){
                        negativeIntegers.remove(0);
                    }
                }
               
                i++;
                j++;
            }

        }
        return ans;
    }
}
