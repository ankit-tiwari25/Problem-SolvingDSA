package InterviewPrep;

import java.util.*;

//Split array based on split size
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,11,1101,1010,13};
        int size = 3;
        List<int[]> ans = splitArray(arr, size);
        for(int i = 0; i < ans.size(); i++){
            int[] newArray = ans.get(i);

            for(int j = 0; j <newArray.length; j++){
                System.out.print(newArray[j] + " ");
            }
            System.out.println();

        }

        System.out.println(ans);
    }

    public static List<int[]> splitArray(int[] arr, int size){
        List<int[]> ans = new ArrayList<>();

      
        for(int i = 0; i < arr.length; i += size){
            int endIndex = Math.min(i+size, arr.length);
            int[] newArray = new int[endIndex-i];
            for(int j = i; j < endIndex; j++){
                newArray[j-i] = arr[j];
            }
            ans.add(newArray);
        }
        return ans;
    }
    
}
