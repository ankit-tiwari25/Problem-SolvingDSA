package March2025Challenge;

/* 2379. [Easy] Minimum Recolors to Get K Consecutive Black Blocks */
public class March8Problem2379MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
       String blocks = "WBBWWBBWBW";
       int k = 7; 
       System.out.println(minimumRecolors(blocks, k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int blackCount = 0, ans = Integer.MAX_VALUE;
      
          for (int i = 0; i < blocks.length(); i++) {
              if (i - k >= 0 && blocks.charAt(i - k) == 'B') blackCount--;
              if (blocks.charAt(i) == 'B') blackCount++;
              ans = Math.min(ans, k - blackCount);
          }
          
          return ans;  
      }
}
