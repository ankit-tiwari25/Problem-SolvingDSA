package ContestQuestions.thoughtwork;

public class MaximizeXorSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        
        int result = maximizeXorSum(a, b);
        System.out.println("Maximum XOR sum: " + result);
    }

    public static int maximizeXorSum(int[] a, int[] b) {
        int n = a.length;
        int currentSum = calculateXorSum(a, b);
        int maxSum = currentSum;

        // Try to reverse each subarray and calculate the potential new XOR sum
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int newSum = currentSum - calculatePartialXorSum(a, b, i, j) + calculatePartialXorSum(reverseSubarray(a, i, j), b, i, j);
                maxSum = Math.max(maxSum, newSum);
            }
        }
        
        return maxSum;
    }

    public static int calculateXorSum(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] ^ b[i]);
        }
        return sum;
    }

    public static int calculatePartialXorSum(int[] a, int[] b, int start, int end) {
        int partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += (a[i] ^ b[i]);
        }
        return partialSum;
    }

    public static int[] reverseSubarray(int[] a, int start, int end) {
        int[] result = a.clone();
        while (start < end) {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }
        return result;
    }
}