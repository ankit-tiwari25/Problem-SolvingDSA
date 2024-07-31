package InterviewPrep.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayOnSize {
    public static void main(String[] args) {
        int arr[] = {12,235,4356,234,1234,12341,1,13,12341,123,123,12312,1234,1234,1234,12341235,234563,45763,47,35,23454};
        int size = 6;
        List<int[]> ans = splitArrayOnSpiltSize(arr, size);
        for(int i = 0; i < ans.size(); i++){
            int[] array = ans.get(i);
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    public static List<int[]> splitArrayOnSpiltSize(int[] arr, int size){
        List<int[]> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i += size){
            int endIndex = Math.min(i + size, arr.length);
            int[] newArray = new int[endIndex-i];
            for(int j = i; j < endIndex; j++){
                newArray[j-i] = arr[j];
            }
            ans.add(newArray);
        }        
        return ans;
    }
}
