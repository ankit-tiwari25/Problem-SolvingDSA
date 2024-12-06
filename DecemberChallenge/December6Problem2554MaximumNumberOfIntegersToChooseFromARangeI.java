package DecemberChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 2554. [Medium] Maximum Number of Integers to Choose From a Range I
 */
public class December6Problem2554MaximumNumberOfIntegersToChooseFromARangeI {
    public static void main(String[] args) {
        // int[] banned = {1,6,5};
        // int n = 5;
        // int maxSum = 6;
        // int[] banned = {11};
        // int n = 7, maxSum = 50;

        int[] banned = {1,2,3,4,5,6,7};
        int n = 8, maxSum = 1;
        System.out.println(maxCount(banned, n, maxSum));
    }
    public static int maxCount(int[] banned, int n, int maxSum) {
     int count = 0;
     Set<Integer> set = new HashSet<>();

     for(int i : banned){
        set.add(i);
     }
    //  if(n > maxSum){
    //     n = n - maxSum;
    //  }
     List<Integer> list = new ArrayList<>();
     
     for(int i = 1; i <= n; i++){
        if(!set.contains(i)){
            list.add(i);
        }
     }

     
    
     int[] arr = new int[list.size()];
     for(int i = 0; i < list.size(); i++){
        arr[i] = list.get(i);
     }

     if(arr.length == 0){
        return 0;
     }
     if(arr.length == 1){
        if(arr[0] > maxSum){
            return 0;
        }else{
            return arr[0];
        }
     }
     Arrays.sort(arr);

     
     int j = list.size()-2;
     int i = list.size()-1;
     while(arr[j] + arr[i] > maxSum){
        i--;
        j--;
     }
     count = i+1;

     return count;   
    }
}
