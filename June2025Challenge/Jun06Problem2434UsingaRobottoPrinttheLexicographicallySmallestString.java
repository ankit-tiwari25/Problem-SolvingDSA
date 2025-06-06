package June2025Challenge;

import java.util.Stack;

/* 2434.[Medium] Using a Robot to Print the Lexicographically Smallest String */
public class Jun06Problem2434UsingaRobottoPrinttheLexicographicallySmallestString {
    public static void main(String[] args) {
        
    }
     public String robotWithString(String s) {
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        StringBuilder t = new StringBuilder();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
            freq[ch - 'a']--;

            // Check if we can pop the top of the stack
            while (!stack.isEmpty() && stack.peek() <= smallestChar(freq)) {
                t.append(stack.pop());
            }
        }

        // Append remaining characters from stack
        while (!stack.isEmpty()) {
            t.append(stack.pop());
        }

        return t.toString();
    }
}
