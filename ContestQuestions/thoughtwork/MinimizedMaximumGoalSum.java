package ContestQuestions.thoughtwork;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizedMaximumGoalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of matches
        int N = scanner.nextInt();
        
        // Read goals scored in each match
        int[] goals = new int[N];
        for (int i = 0; i < N; i++) {
            goals[i] = scanner.nextInt();
        }
        
        // Sort the goals array
        Arrays.sort(goals);
        
        // Initialize the minimized maximum sum
        int minimizedMaxSum = 0;
        
        // Pair the smallest and largest remaining elements
        for (int i = 0; i < N / 2; i++) {
            int pairSum = goals[i] + goals[N - 1 - i];
            minimizedMaxSum = Math.max(minimizedMaxSum, pairSum);
        }
        
        // Output the minimized maximum sum
        System.out.println(minimizedMaxSum);
        
        scanner.close();
    }
}