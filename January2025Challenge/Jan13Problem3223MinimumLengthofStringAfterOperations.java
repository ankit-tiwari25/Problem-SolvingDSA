package January2025Challenge;
/* 3223. [Medium] Minimum Length of String After Operations */
public class Jan13Problem3223MinimumLengthofStringAfterOperations {
    public static void main(String[] args) {
        
    }
    public static int minimumLength(String s) {
        int[] charFrequency = new int[26];
       int totalLength = 0;
       for (char c : s.toCharArray()) {
           charFrequency[c - 'a']++;
       }
       for (int frequency : charFrequency) {
           if (frequency == 0) continue;
           if (frequency % 2 == 0) {
               totalLength += 2;
           } else {
               totalLength += 1;
           }
       }
       return totalLength;
   }

}
