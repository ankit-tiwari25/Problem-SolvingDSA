package Recursion.InputOutputMethod;

import java.util.ArrayList;
import java.util.List;

// Video 17 - Generate balanced parenthesis
/*  Given N = 3..means 3 open or 3 close parenthesis hai..unko use kar k sare balanced parenthesis bnane hai
 *  Exetended Input output method
 *  input or output dono alag alag data type k ho sakte hai
 */
public class GenerateBalancedParenthesis {
    public static void main(String[] args) {
        int n = 4;
        String output = "";
        int open = n;
        int close = n;
        List<String> list = new ArrayList<>();
        solve(output, open, close, list);
        System.out.println(list);
    }
    public static void solve(String output, int open, int close, List<String> list){
        if(open == 0 && close == 0){
            // Leaf node - output me answer hai
            list.add(output);
            return;
        }
        // Jab choice na ho 
        // first : Jab Open 0 hai 
        if(open == 0){
            String op = output + ")";
            solve(op, open, close-1, list);
        }else if(open == close){
            String op = output + "(";
            solve(op, open-1, close, list);
        }else{
            String op1 = output + "(";
            solve(op1, open-1, close, list);
            String op2 = output + ")";
            solve(op2, open, close-1, list);
        }
    }
}

