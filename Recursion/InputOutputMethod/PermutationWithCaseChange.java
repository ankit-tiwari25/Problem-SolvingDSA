package Recursion.InputOutputMethod;

//Permutation with case change
/*
 *  input = "ab"
 *  output = {ab ,aB,Ab,AB}
 */
public class PermutationWithCaseChange {
    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        solve(input, output);
    }
    public static void solve(String input, String output){
        if(input.length() == 0){
            System.out.println(output + " ");
            return;
        }
        String op1 = output;
        String op2 = output;
        char ch = input.charAt(0);
        op1 = op1 + ch;
        op2 = op2 + (char)(ch - 32);
        input = input.substring(1);
        solve(input, op1);
        solve(input, op2);
    }
}
