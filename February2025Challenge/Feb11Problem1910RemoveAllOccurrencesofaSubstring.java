package February2025Challenge;

// 1910. [Medium] Remove All Occurrences of a Substring
public class Feb11Problem1910RemoveAllOccurrencesofaSubstring {
    public static void main(String[] args) {
       String s = "daabcbaabcbc", part = "abc";
       System.out.println(removeOccurrences(s, part));
    }
    public static String removeOccurrences(String s, String part) {
        char[] input = s.toCharArray();
 char[] target = part.toCharArray();
 char[] resultStack = new char[input.length];
 int stackSize = 0, targetLength = target.length;
 char targetEndChar = target[targetLength - 1];

 for (char currentChar : input) {
     resultStack[stackSize++] = currentChar;

     if (currentChar == targetEndChar && stackSize >= targetLength) {
         int i = stackSize - 1, j = targetLength - 1;
         
         while (j >= 0 && resultStack[i] == target[j]) {
             i--;
             j--;
         }

         if (j < 0) {
             stackSize = i + 1;
         }
     }
 }
 return new String(resultStack, 0, stackSize); 
}
}
