package Recursion;
// Tower of Hanoi using recursion
public class TowerOfHanoi {
    public static void main(String[] args) {
        int plates = 3;
        String src = "A";
        String help = "B";
        String dest = "C";

        solve(plates, src, dest, help);

    }
    public static void solve(int n, String src, String dest, String help){
        if(n == 1){
            System.out.println("Moving plate " + n + " From " + src + " to " + dest + " using " + help);
            return;
        }
        solve(n-1, src, help, dest);
        System.out.println("Moving plate " + n + " From " + src + " to " + dest + " using " + help);
        solve(n-1, help, dest, src);
        
    }
}
