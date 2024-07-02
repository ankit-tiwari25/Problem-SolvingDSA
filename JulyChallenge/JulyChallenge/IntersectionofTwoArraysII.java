package JulyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 350. [Easy] Intersection of Two Arrays II
// 2 July 2024

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] ans = intersect(nums1, nums2);
        display(ans);
    }
     public static int[] intersect(int[] nums1, int[] nums2) {
        // Approach -1 Haspmap
        /*
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int ans[] = new int[list.size()];
        int j = 0;
        for(int i : list){
            ans[j] = i;
            j++;
        }
        return ans;

        */
        /* Appraoch 2 - sorting  */

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        int i = 0; //nums1
        int j = 0; // nums2
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int ans[] = new int[list.size()];
        int k = 0;
        for(int p : list){
            ans[k] = p;
            k++;
        }
        return ans;


    }

    public static void display(int arr[]){

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
