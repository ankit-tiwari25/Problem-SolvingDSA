/* 2145. Count the Hidden Sequences */
public class April21Problem2145CounttheHiddenSequences {
    public static void main(String[] args) {
        
    }
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0, maxi = 0, mini = 0;
        for (int x : differences) {
            sum += x;
            maxi = Math.max(maxi, sum);
            mini = Math.min(mini, sum);
        }
        return (int)Math.max(0, upper - lower - maxi + mini + 1);
    }
}
