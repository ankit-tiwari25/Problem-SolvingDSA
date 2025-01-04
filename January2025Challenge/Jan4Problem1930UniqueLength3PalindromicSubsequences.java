package January2025Challenge;

import java.util.HashSet;

/* 1930. [Medium] Unique Length-3 Palindromic Subsequences
 */
public class Jan4Problem1930UniqueLength3PalindromicSubsequences {
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
    public static int countPalindromicSubsequence(String s) {
           int[] R = new int[26];
        for (char u : s.toCharArray()) {
            R[u - 'a']++;
        }
        int[] L = new int[26];
        HashSet<Integer> S = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a';
            R[t]--;
            for (int j = 0; j < 26; j++) {
                if (L[j] > 0 && R[j] > 0) {
                    S.add(26 * t + j);
                }
            }
            L[t]++;
        }

        return S.size();
    }
}
