package February2025Challenge;

/* 3174. [Easy] Clear Digits */
public class Feb10Problem3174ClearDigits {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
       for (char c : s.toCharArray()) {
           if (Character.isDigit(c)) {
               if (stack.length() > 0) {
                   stack.deleteCharAt(stack.length() - 1);
               }
           } else {
               stack.append(c);
           }
       }
       return stack.toString();
   }
}
