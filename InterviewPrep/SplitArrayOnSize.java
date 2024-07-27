package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayOnSize {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int splitSize = 4;
        int[][] ans = splitArray(arr, splitSize);
        display(ans);

    }
    public static int[][] splitArray(int[] arr, int splitSize){
        List<int[]> list = new ArrayList<>();
        int endIndex = splitSize;
        for(int i = 0; i < arr.length; ){
            int remainingElements = arr.length - endIndex;
            int[] minArr = new int[Math.min(splitSize, remainingElements)];
            for(int j = 0; j < splitSize && i < arr.length; j++){
                minArr[j] = arr[i];
                i++;
            }
            endIndex = i;
            list.add(minArr);

        }
        System.out.println("List");
        displayList(list);
        int r = list.size();
        int c = splitSize;
        int[][] ans = new int[r][c];
        for(int i = 0; i < r; i++){
            int[] minArr = list.get(i);
            for(int j = 0; j < minArr.length; j++){
                ans[i][j] = minArr[j];
            }
        }
        return ans;
    }

    public static void display(int[][] ans){
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void displayList(List<int[]> ans){
        for(int i = 0; i < ans.size(); i++){
            int[] arr = ans.get(i);
            for(int j  : arr){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
