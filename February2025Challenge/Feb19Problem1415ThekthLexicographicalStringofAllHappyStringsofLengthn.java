/*1415. [Medium] The k-th Lexicographical String of All Happy Strings of Length n */
public class Feb19Problem1415ThekthLexicographicalStringofAllHappyStringsofLengthn {
    static int n2;
    public static void main(String[] args) {
        int n = 1, k = 3;
        System.out.println(getHappyString(n, k));
    }
    public static String getHappyString(int n, int k) {
        n2 = n;
      return dfs(new StringBuilder(), n, k);
  }
    public static String dfs(StringBuilder prefix, int n, int k){
        if (n == 0)
            return prefix.toString();
        for (char c = 'a'; c <= 'c'; c++) {
            if (prefix.length() > 0 && c == prefix.charAt(prefix.length() - 1))
                continue;
            int cnt = (int) Math.pow(2, n2 - prefix.length() - 1);
            if (cnt >= k)
                return dfs(prefix.append(c), n - 1, k);
            else
                k -= cnt;
        }
        return "";
    }
}
