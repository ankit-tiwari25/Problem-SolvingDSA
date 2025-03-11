package March2025Challenge;
/* 1358.[Medium] Number of Substrings Containing All Three Characters */
public class March11Problem1358NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        
    }
    public int numberOfSubstrings(String s) {
        int count = 0;
     int left = 0;
     int[] charCount = new int[3];

     for (int right = 0; right < s.length(); right++) {
         charCount[s.charAt(right) - 'a']++;

         while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
             count += s.length() - right;
             charCount[s.charAt(left) - 'a']--;
             left++;
         }
     }

     return count;
 }
}
