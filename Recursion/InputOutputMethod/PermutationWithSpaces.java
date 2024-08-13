package Recursion.InputOutputMethod;
// Permutation with spaces
/*
 * i/p = ABC
 * o/p = A_B_C
 *      A_BC
 *      AB_C
 *      ABC
 */
public class PermutationWithSpaces {
    public static void main(String[] args) {
        String input = "ABC";
        String output = "";

        output = output  + input.charAt(0);
        input = input.substring(1);
        solve(input, output);
    }
    public static void solve(String input, String output){
        if(input.length() == 0){
            System.out.println(output + " ");
            return;
        }
        String op1 = output;
        String op2 = output;
        op1 = op1 + input.charAt(0);
        op2 = op2 + "_"+ input.charAt(0);
        input = input.substring(1);
        solve(input, op1);
        solve(input, op2);
    }
}
