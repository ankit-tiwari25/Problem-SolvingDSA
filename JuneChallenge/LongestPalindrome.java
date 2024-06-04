package JuneChallenge;

import java.util.HashMap;

// 409. [Easy] Longest Palindrome
// 04 - 06-2024
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));

    }
     public static int longestPalindrome(String s) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        int oddFrequencyCount = 0;
        for (char ch : s.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            if (charFrequency.get(ch) % 2 == 1)
                oddFrequencyCount++;
            else
                oddFrequencyCount--;
        }
        if (oddFrequencyCount > 1)
            return s.length() - oddFrequencyCount + 1;
        return s.length();
    }
}
