import java.util.Scanner;

class decreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Decreasing order");
        // decreasing(n);
        // System.out.println("Increasing order");
        // increasing(n);

        System.out.println(solve(3, 2));
    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasing(n - 1);
    }

    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n - 1);
        System.out.println(n);
    }

    public static int solve(int A, int B) {
        int n = A + B;
        int value = 0;

        while (n >= A) {
            value += 1 << (n - 1);
            System.out.println(value);
            n = n - 1;
        }
        return value;
    }

}