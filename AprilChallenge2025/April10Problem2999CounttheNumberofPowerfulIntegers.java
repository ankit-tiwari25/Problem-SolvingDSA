package AprilChallenge2025;
/* 2999.[Hard] Count the Number of Powerful Integers */
public class April10Problem2999CounttheNumberofPowerfulIntegers {
    public static void main(String[] args) {
        
    }
    static public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        char[] suffixReq = s.toCharArray();
        return result(finish, suffixReq, limit) - result(start - 1, suffixReq, limit);
    }
}
