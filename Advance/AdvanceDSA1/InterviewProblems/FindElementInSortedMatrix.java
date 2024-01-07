package Advance.AdvanceDSA1.InterviewProblems;

public class FindElementInSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 4, 5, 9, 11 },
                { 1, 4, 7, 8, 10, 14 },
                { 3, 7, 9, 10, 12, 18 },
                { 6, 10, 12, 14, 16, 20 },
                { 11, 15, 19, 21, 24, 27 },
                { 18, 24, 29, 32, 34, 42 },
        };

        System.out.println("" + checkElementInSortedMatrix(mat, 15));
    }

    public static boolean checkElementInSortedMatrix(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = m - 1;
        while ((i >= 0 && i < n) && (j >= 0 && j < m)) {
            if (mat[i][j] == k) {
                return true;
            } else if (mat[i][j] < k) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }
}
