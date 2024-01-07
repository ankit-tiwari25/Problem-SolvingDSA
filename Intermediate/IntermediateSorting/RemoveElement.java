package IntermediateSorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 4 };
        System.out.println(removeElement(arr));
    }

    public static int removeElement(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int n = arr.length;
        for (int i = n - 1, j = 1; i >= 0; i--, j++) {
            ans = ans + arr[i] * j;
        }
        return ans;

    }

}