package January2025Challenge;

/*
 *  2429. [Medium] Minimize XOR
 */
public class Jan15Problem2429MinimizeXOR {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5;
        System.out.println(minimizeXor(num1, num2));
    }
    public static int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1);
      int b = Integer.bitCount(num2);
      int res = num1;
      for (int i = 0; i < 32; i++) {
          if (a > b && ((1 << i) & num1) > 0) {
              res ^= 1 << i;
              a--;
          }
          if (a < b && ((1 << i) & num1) == 0) {
              res ^= 1 << i;
              a++;
          }
      }
      return res;
  }
}
