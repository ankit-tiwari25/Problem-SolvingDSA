package RandomQuestions;
import java.util.Scanner;

public class UserInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("A = " + a + " B = " + b);
    }
}
