package Advance.AdvanceDSA1.BitManipulation;

import java.util.ArrayList;

/*
 * Question : In a given array, every element is repeating twice except two elements. 
              Find those two unique elememnts.
    Appraoch 1 : Find frequency of each element. --> O(n2);
    Approach 2 : Sort and check every second element. --> )O(n log n)
    Approach 3 : Using bit manipulation. 
    Find XOR of all elements 
    check first set bit, divide enitre array based on that bit.
    Form two clusters, XOR those two clusters.
    Each cluster will have one unique element.
 */
public class ThriceTwoUnique {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 5, 7, 11, 11, 9, 15, 4, 4 };
        int n = arr.length;
        int ans[] = findTwoUnique(arr, n);

        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] findTwoUnique(int[] arr, int n) {
        int ans[] = new int[2];

        int xor = 0;
        // Get XOR of enitre array
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        System.out.println(" xor : " + xor);
        // Get first set bit in xored value
        int bit = -1;
        for (int i = 0; i < 32; i++) {
            if (checkBit(xor, i) == true) {
                bit = i;
                break;
            }
        }
        System.out.println("Bit : " + bit);

        // Form two clusters based on ith bit set or unset

        ArrayList<Integer> setBits = new ArrayList<>();
        ArrayList<Integer> unsetBits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (checkBit(arr[i], bit) == true) {
                setBits.add(arr[i]);
            } else {
                unsetBits.add(arr[i]);
            }
        }

        // XOR of all setBit elements
        int setBitElement = 0;
        for (int i = 0; i < setBits.size(); i++) {
            setBitElement = setBitElement ^ setBits.get(i);
        }

        // XOR of all unsetBits elements
        int unsetBitElement = 0;
        for (int i = 0; i < unsetBits.size(); i++) {
            unsetBitElement = unsetBitElement ^ unsetBits.get(i);
        }
        ans[0] = setBitElement;
        ans[1] = unsetBitElement;
        return ans;
    }

    public static boolean checkBit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

}
