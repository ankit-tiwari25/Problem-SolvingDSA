package IntermediateSorting;

import java.util.Arrays;

public class NobleIntegers {
    public static void main(String[] args) {
        int arrUnique[] = { -1, -5, 3, 5, -10, 4 };
        int arrRepeating[] = { 0, 2, 2, 3, 3, 6 };
        System.out.println("Unique noble integers : " + nobleIntegersDistinct(arrUnique));
        System.out.println("Repeating ele noble integers : " + nobleIntegersRepeating(arrRepeating));
    }

    public static int nobleIntegersDistinct(int[] arr) {
        // Array elements are unique
        int ans = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                ans++;
            }
        }
        return ans;

    }

    public static int nobleIntegersRepeating(int[] arr) {
        // Array elements are repeating
        int n = arr.length;
        int less = 0;
        int ans = 0;

        Arrays.sort(arr);
        if (arr[0] == 0) {
            ans++;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                less = i;
            }
            if (less == arr[i]) {
                ans++;
            }
        }
        return ans;
    }

}
