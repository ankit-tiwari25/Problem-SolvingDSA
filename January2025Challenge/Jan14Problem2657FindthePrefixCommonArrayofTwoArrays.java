package January2025Challenge;
/*
 *  2657.[Medium] Find the Prefix Common Array of Two Arrays
 */
public class Jan14Problem2657FindthePrefixCommonArrayofTwoArrays {
 public static void main(String[] args) {
    
 }   
 public static int[] findThePrefixCommonArray(int[] A, int[] B) {
    int n = A.length;
  int[] freq = new int[n + 1];
  int[] ans = new int[n];
  int common = 0;

  for (int i = 0; i < n; i++) {
      if (++freq[A[i]] == 2) common++;
      if (++freq[B[i]] == 2) common++;
      ans[i] = common;
  }
  return ans;
}
}
