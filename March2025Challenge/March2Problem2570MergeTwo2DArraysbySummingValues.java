package March2025Challenge;

import java.util.ArrayList;
import java.util.List;

/* 2570.[Easy] Merge Two 2D Arrays by Summing Values */
public class March2Problem2570MergeTwo2DArraysbySummingValues {
    public static void main(String[] args) {
        int[][]  nums1 = {{1,2},{2,3},{4,5}};
        int[][]  nums2 = {{1,4},{3,2},{4,1}};
        int[][] ans = mergeArrays(nums1, nums2);
        display(ans);
    }
     public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
         // Initialize pointers for both arrays
        int i = 0, j = 0;
        // List to store our merged results
        List<int[]> resultList = new ArrayList<>();
        
        // Traverse both arrays with two pointers
        while (i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];
            
            if (id1 < id2) {
                // Id1 is smaller, add it to result
                resultList.add(new int[]{id1, val1});
                i++;
            } else if (id2 < id1) {
                // Id2 is smaller, add it to result
                resultList.add(new int[]{id2, val2});
                j++;
            } else {
                // Ids are equal, sum the values
                resultList.add(new int[]{id1, val1 + val2});
                i++;
                j++;
            }
        }
        
        // Add remaining elements from nums1, if any
        while (i < nums1.length) {
            resultList.add(nums1[i]);
            i++;
        }
        
        // Add remaining elements from nums2, if any
        while (j < nums2.length) {
            resultList.add(nums2[j]);
            j++;
        }
        
        // Convert List to array
        int[][] result = new int[resultList.size()][2];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        
        return result; 
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
