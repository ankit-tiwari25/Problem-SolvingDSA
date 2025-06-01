package June2025Challenge;
/* 2929.[Medium] Distribute Candies Among Children II */
public class Jun1Problem2929DistributeCandiesAmongChildrenII {
  public static void main(String[] args) {
    int  n = 5, limit = 2;
    System.out.println(distributeCandies(n, limit));
  }
   public static long distributeCandies(int n, int m) {
          long res = ((long)n + 2) * (n + 1) / 2;
        for (int i = 1; i <= 3; i++) {
            long rem = n - (long)i * (m + 1);
            if (rem < 0) break;
            long val = (rem + 2) * (rem + 1) / 2;
            long c = (i < 3 ? 3 : 1);
            res += (i % 2 != 0 ? -c * val : c * val);
        }
        return res;
    }
}
