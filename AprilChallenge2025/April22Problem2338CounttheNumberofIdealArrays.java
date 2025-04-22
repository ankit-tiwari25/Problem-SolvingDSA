
/* 2338.[Hard] Count the Number of Ideal Arrays */
public class April22Problem2338CounttheNumberofIdealArrays {
    public static void main(String[] args) {
        int n = 2, maxValue = 5;
        System.out.println(idealArrays(n,maxValue));
    }
    static final int mod = 1000000007;
    public static int[] factMemo = new int[100000];
    public static int[][] dp = new int[100000][15];

    public static long power(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    public static long fact(int x) {
        if (x == 0) return 1;
        if (factMemo[x] != 0) return factMemo[x];
        factMemo[x] = (int)((1L * x * fact(x - 1)) % mod);
        return factMemo[x];
    }

    public static long mod_inv(int a, int b) {
        return fact(a) * power(fact(b), mod - 2, mod) % mod * power(fact(a - b), mod - 2, mod) % mod;
    }

    public static int idealArrays(int n, int maxValue) {
        int m = Math.min(n, 14);
        for (int i = 1; i <= maxValue; i++)
            for (int j = 1; j <= m; j++)
                dp[i][j] = 0;
        for (int i = 1; i <= maxValue; i++) {
            dp[i][1] = 1;
            for (int j = 2; i * j <= maxValue; j++)
                for (int k = 1; k < m; k++)
                    dp[i * j][k + 1] += dp[i][k];
        }
        long res = 0;
        for (int i = 1; i <= maxValue; i++)
            for (int j = 1; j <= m; j++)
                res = (res + mod_inv(n - 1, n - j) * dp[i][j]) % mod;
        return (int)res;
    }
}
