package Recursion;

public class PrintOnrToN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("One To N");
        printOneToN(n);
        System.out.println();
        System.out.println("N to One");
        printNToOne(n);
    }

    public static void printOneToN(int n){
        if(n == 1){ // Base Condition
            System.out.print(" " + n); 
            return;
        }
        printOneToN(n-1); // Hyposthesis
        System.out.print( " " + n); // Induction
    }

    public static void printNToOne(int n){
        if(n == 1){ // Base condition
            System.out.print(" " + n);
            return;
        }
        System.out.print(" " + n); // Induction
        printNToOne(n-1); // Hyposthesis
    }
}
