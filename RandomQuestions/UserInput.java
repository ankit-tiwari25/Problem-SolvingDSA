package RandomQuestions;
import java.util.Scanner;

public class UserInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
            // A is greatest (possibility hai)
            if(a > c){
                System.out.println(a + " is greater than " + b + " and "+ c);
            }else{
                System.out.println(c + " is greater than " + a + "and "+ b);
            }
        }else{
            // B is greatest (possibility hai)
            if(b > c){
                System.out.println(b + " is greater than " + a + "and "+ c);
            }else{
                System.out.println(c + " is greater than " + a + "and "+ b);
            }
        }
        // System.out.println("A = " + a + " B = " + b);
    }
}

