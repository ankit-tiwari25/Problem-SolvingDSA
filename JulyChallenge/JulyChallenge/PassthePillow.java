package JulyChallenge;
// 2582. [Easy] Pass the Pillow
// 6th July 2024

public class PassthePillow {
    public static void main(String[] args) {
        int n = 3;
        int time = 2;
        System.out.println(passThePillow(n, time));
    }
    public static int passThePillow(int n, int time) {
        int chunks = time / (n - 1);
         return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
     }
}
