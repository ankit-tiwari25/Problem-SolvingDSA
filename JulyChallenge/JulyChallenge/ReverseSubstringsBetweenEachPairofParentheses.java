package JulyChallenge;

import java.util.Stack;

// 1190. [Medium] Reverse Substrings Between Each Pair of Parentheses
// 11 July 2024
public class ReverseSubstringsBetweenEachPairofParentheses {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
     public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') 
                stack.push(result.length());
            else if (currentChar == ')') {
                int start = stack.pop();
                reverse(result, start, result.length() - 1);
            } else result.append(currentChar);
        }
        return result.toString(); 
    }
    private static void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

}
