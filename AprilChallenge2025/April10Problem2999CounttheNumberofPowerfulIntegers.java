package AprilChallenge2025;

import java.util.Arrays;

/* 2999.[Hard] Count the Number of Powerful Integers */
public class April10Problem2999CounttheNumberofPowerfulIntegers {
    public static void main(String[] args) {
        
    }
    static public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        char[] suffixReq = s.toCharArray();
        return result(finish, suffixReq, limit) - result(start - 1, suffixReq, limit);
    }
     static long result(long num, char[] sarr, int limit) {
        char[] range = Long.toString(num).toCharArray();
        int n = range.length, sLen = sarr.length;
        Long[][] dp = new Long[n][2];
        boolean checkIfSTrictThenPoss = false;
        if (isSmaller(range, sarr)){
            checkIfSTrictThenPoss = isSmaller(Arrays.copyOfRange(range, (n - sarr.length) , n), sarr);
            return solve(0, 0, range, sarr, limit, n, dp, checkIfSTrictThenPoss, sLen);
        }
        return 0;
    }

}
