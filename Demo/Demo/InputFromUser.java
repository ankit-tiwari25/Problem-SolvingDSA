package Demo;

//Step 1 : import java.util.*; // java.util.Scanner;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        //Taking input from user
        // 1. import package java.util.*; * matlab all
        // 2. creating object of Scanner (Using new keyword)
        // 3. use scanner object to get value (useing next)


        //Creating object of Scanner
        //Classname object_name = new Class_name(Arguments);
        Scanner sc = new Scanner(System.in);

        //User Details
        int rollNumber;
        String name; //single world
        int age;
        long phoneNumber; 
        String place; // multi word
        float weight;

        System.out.println("Enter your roll number : ");
        rollNumber = sc.nextInt();
        System.out.println("Enter your name : ");
        name = sc.next();
        System.out.println("Enter your weight : ");
        weight = sc.nextFloat();


        System.out.println("**** USER DETAILS *****");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("Weight : " + weight + " KG");

    }
}
