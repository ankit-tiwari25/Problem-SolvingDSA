package Advance.AdvanceDSA1.InterviewProblems;

/*
 * Question : Given an array having ele. Find first missing natural number
 * Approach 1 : sorting
 * Approach 2 : Using hashset
 * Approach 3 : Swapping elements.
 */
public class FirstMissingNo {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 6, 9, 1, 8, 3 };
        int n = arr.length;
        System.out.println("First Missing natural number : " + firstMissingNumber(arr, n));

    }

    public static int firstMissingNumber(int[] arr, int n) {
        // Approach 3 : Swapping elements
        int ans = -1;
        for (int i = 0; i < n; i++) {
            while ((arr[i] > 0 && arr[i] <= n) && arr[i] != i + 1) {
                int val = arr[i];
                // Check duplicates
                if (arr[i] == arr[val - 1]) {
                    break;
                }

                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans = i + 1;
                break;
            }
        }
        return ans;

    }

}
