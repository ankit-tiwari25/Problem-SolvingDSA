package RandomQuestions;

import java.util.Scanner;

public class InputTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        // int addition = a+b;
        // int substraction = a-b;
        // int multiplication = a*b;
        // int division = a/b;
        System.out.println("addition is " +(a + b));
        System.out.println("substraction is " +(a-b));
        System.out.println("multiplication is " +(a * b));
        System.out.println("division is " + (a/b));
    }
}
