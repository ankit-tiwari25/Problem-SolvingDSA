package Recursion.InputOutputMethod;
// Subset of a string using recursion
public class SubsetOfString {
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        solve(input,output);
    }

    public static void solve(String input, String output){
        if(input.length() == 0){
            System.out.println(output + " ");
            return;
        }

        String op1 = output;
        String op2 = output;
        op2 = op2 + input.charAt(0);
        input = input.substring(1);
        solve(input,op1);
        solve(input, op2);
    }
}
