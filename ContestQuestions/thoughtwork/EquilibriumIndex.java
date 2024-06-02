package ContestQuestions.thoughtwork;

import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of children
        int n = scanner.nextInt();
        
        // Reading the values assigned to the children
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find and print the equilibrium index
        int equilibriumIndex = findEquilibriumIndex(arr);
        System.out.println(equilibriumIndex);
    }

    private static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int value : arr) {
            totalSum += value;
        }

        // Traverse the array and find the equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // totalSum now represents the right sum for index i
            totalSum -= arr[i];

            // Check if left sum equals right sum
            if (leftSum == totalSum) {
                return i;
            }

            // Update left sum for the next index
            leftSum += arr[i];
        }

        // If no equilibrium index is found, return -1
        return -1;
    }
}