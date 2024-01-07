package Advance.AdvanceDSA1.BitManipulation;

/*
 * Question : In an array, every element is repeating thrice, except one. Find unique element
 * Approach 1 : Count of every element, find unique ele. 
 * Appraoch 2 : Sort the array, check every third element
 * Approach 3 : Using bit manipulation, every bit contributes thrice
 */

public class ThriceUnique {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 5, 4, 7, 11, 11, 9, 11, 7, 5, 4, 4 };
        int n = arr.length;
        System.out.println(findUniqueElement(arr, n));

    }

    public static int findUniqueElement(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (checkBit(arr[j], i) == true) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans = ans + (1 << i);
            }
        }
        return ans;
    }

    public static boolean checkBit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;
        }
        return false;
    }
}
