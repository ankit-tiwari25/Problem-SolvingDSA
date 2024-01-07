package Advance.AdvanceDSA1.BitManipulation;

import java.util.ArrayList;

/*
 * Question : An array contains all the elements from [1 - n+2]. Find those two missing numbers.
 * Appraoch : Sort and check
 * Appraoch : Frequency Array
 * Appraoch 3: Using bit manipulation
 * Create an arraylist having all the elements from 1 - n + 2 and add all the elements present in the given array.
 * Now you have an arraylist containing all the elements twice except 2.
 * Similar question to thricetwounique
 * Create cluster
 */
public class TwoMissingElements {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 1, 4 };
        int n = arr.length;
        int ans[] = findMissingTwoElements(arr, n);

        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] findMissingTwoElements(int[] arr, int n) {
        int ans[] = new int[2];

        // Creating array list containing n+2 elements

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n + 2; i++) {
            list.add(i);
        }

        // System.out.println(list);
        // Adding all elements present in array in the arraylist
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        // Getting xored value of two missing elements
        int xor = 0;
        for (int i = 0; i < list.size(); i++) {
            xor = xor ^ list.get(i);
        }

        // Finding first set bit
        int bit = -1;

        for (int i = 0; i < 32; i++) {
            if (checkBit(xor, i)) {
                bit = i;
                break;
            }
        }

        // Create Cluster based on this bit

        ArrayList<Integer> setBitCluster = new ArrayList<>();
        ArrayList<Integer> unsetBitCluster = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if (checkBit(val, bit) == true) {
                setBitCluster.add(val);
            } else {
                unsetBitCluster.add(val);
            }
        }

        // Finding element with set bit
        int setBitNumber = 0;
        for (int i = 0; i < setBitCluster.size(); i++) {
            setBitNumber = setBitNumber ^ setBitCluster.get(i);
        }

        // Finding element with unsetBit cluster
        int unsetBitNumber = 0;
        for (int i = 0; i < unsetBitCluster.size(); i++) {
            unsetBitNumber = unsetBitNumber ^ unsetBitCluster.get(i);
        }

        ans[0] = setBitNumber;
        ans[1] = unsetBitNumber;

        return ans;
    }

    public static boolean checkBit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;
        }
        return false;
    }
}
