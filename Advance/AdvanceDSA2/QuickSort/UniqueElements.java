package Advance.AdvanceDSA2.QuickSort;

import java.util.Arrays;

/*
 * Question : You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.
Find the minimum number of steps.

Example 1:  A = [1, 1, 3]
Output 1:  1

Example 2 : A = [2, 4, 5]
Output 2:   0 
 */
public class UniqueElements {
    public static void main(String[] args) {
        int A[] = { 51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6, 14, 23, 72, 18, 56,
                30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75, 69,
                54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66,
                73, 13, 85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69,
                62 };
        int B[] = { 2, 4, 3, 5, 4, 3 };
        System.out.println("Minimum Steps : " + findUniqueElements(A));

    }

    public static int findUniqueElements(int[] A) {
        // Minimum no. of steps
        int count = 0;
        int n = A.length;

        Arrays.sort(A);
        for (int x : A) {
            System.out.print(x + " ");
        }
        for (int i = 1; i < n; i++) {
            if (A[i - 1] > A[i]) {
                int diff = A[i - 1] - A[i];
                A[i] = A[i] + diff;
                count = count + diff;
            }
            if (A[i - 1] == A[i]) {
                A[i] = A[i] + 1;
                count++;
            }
        }

        return count;
    }
}
