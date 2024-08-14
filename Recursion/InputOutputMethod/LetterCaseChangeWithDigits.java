package Recursion.InputOutputMethod;

import java.util.ArrayList;
import java.util.List;

// Letter case change with Digits - Video 16 (Aditya Verma Recursion Series)
/*
 *   String input = a1B2
 *    output = { a1B2, A1B2, a1b2, A1b2}
 * Basically agar letter hai to case change kar k push, or digit hai to directly push to output
 */
public class LetterCaseChangeWithDigits {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        String input = "a1B2";
        String output = "";
        
        solve(input, output, list);
        System.out.println(list);
    }
    public static void solve(String input, String output, List<String> list){
        if(input.length() == 0){
            list.add(output);
            return;
        }

        if(Character.isAlphabetic(input.charAt(0))){
            String op1 = output;
            String op2 = output;

            op1 = op1 + Character.toLowerCase(input.charAt(0));
            op2 = op2 + Character.toUpperCase(input.charAt(0));
            input = input.substring(1);
            solve(input, op1, list);
            solve(input, op2, list);
        }else{
            String op = output;
            op = op + input.charAt(0);
            input = input.substring(1);
            solve(input, op, list);
        }
    }

}
