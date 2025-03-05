package March2025Challenge;

/* 2579.[Medium] Count Total Number of Colored Cells */
public class March5Problem2579CountTotalNumberofColoredCells {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(coloredCells(n));
    }
    public static long coloredCells(int n) {
        return 1 + 4L * n * (n - 1) / 2;
    }
}
