package May2025;
/* 1128.[Easy] Number of Equivalent Domino Pairs */
public class May4Problem1128NumberofEquivalentDominoPairs {
    public static void main(String[] args) {
        
    }
    public long cantorPair(int a, int b) {
        int x = Math.min(a, b), y = Math.max(a, b);
        long sum = x + y;
        return (sum * (sum + 1)) / 2 + y;
    }
}
