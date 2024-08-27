package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // Rows
            for(int j=1; j <= (n-i+1); j++){ // columns
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
       
        }
    }
}

/*
1 2 3 4 5       row = i = 1   1 - n
1 2 3 4         row = i = 2   1 - n- i + 1   
1 2 3           row = i = 3   1 - n-2
1 2             row = i = 4   1 - n-3
1               row = i = 5   1 - n-4
*/

/*
 *  1 - (n-2)
 * 
 * for(int i = 1; i <= n-2; i++){
 * sout(i)
 * }
 */
