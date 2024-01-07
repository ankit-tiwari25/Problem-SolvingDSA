package Advance.AdvanceDSA2.RadixSort;

import java.util.ArrayList;

public class CountSort {
    public static void main(String[] args) {
        int A[] = { 2, 4, 3, 5, 4, 3 };

        int[] sortedArray = countSort(A);

        for (int x : sortedArray) {
            System.out.print(x + " ");
        }
    }

    public static int[] countSort(int[] A) {
        // For range 0 to n or non negative numbers...
        int n = A.length; // Array ki length
        int freqLen = (int) Math.pow(10, 5) + 1; // Frequency array ki length

        // Creating frequency array
        int[] freq = new int[freqLen];

        // Traversing through given array and filling freq array

        for (int i = 0; i < n; i++) {
            int val = A[i];
            freq[val]++;
        }

        // Creating arraylist to store values
        ArrayList<Integer> values = new ArrayList<>();

        // Traversing through freq array and filling arraylist

        for (int i = 0; i < freqLen; i++) {
            int count = freq[i];

            while (count != 0) {
                values.add(i);
                count--;
            }
        }

        // Converting arraylist to array

        int[] ans = new int[values.size()];
        int j = 0;

        for (Integer x : values) {
            ans[j] = x;
            j++;
        }

        return ans;

    }
}
