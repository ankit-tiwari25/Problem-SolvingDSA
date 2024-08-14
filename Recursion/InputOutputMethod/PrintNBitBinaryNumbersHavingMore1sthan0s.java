package Recursion.InputOutputMethod;

import java.util.ArrayList;
import java.util.List;
// Video 18 - Recursion
/*  Print N-bit binary numbers having more 1s than 0s
    sare N digit binary numbers jinke prefix me no. of 1s >= no. of 0s hai
   
 *  eg n = 5          (Prefixes)1s  0s
 * n digit binary no. : 11010   3   2
 *                      1101    3   1
 *                      110     2   1
 *                      11      2   0
 *                      1       1   0
 * 
 * Problem link : https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1
 */
public class PrintNBitBinaryNumbersHavingMore1sthan0s {
    public static void main(String[] args) {
        int n = 5;
        int one = 0;
        int zeros = 0;
        List<String> list = new ArrayList<>();
        String output = "";
        solve(n, one, zeros,output, list);
        System.out.println(list);
        
    }
    public static void solve(int n, int ones, int zeros, String output,  List<String> list){
        if(n == 0){
            list.add(output);
            return;
        }

        String op1 = output;
        op1 = op1 + "1";
        solve(n-1, ones+1, zeros, op1, list);
        if(ones > zeros){
            // 0s bhi add honge
            String op2 = output;
            op2 = op2 + "0";
            solve(n-1, ones, zeros+1, op2, list);
        }
    }
}
