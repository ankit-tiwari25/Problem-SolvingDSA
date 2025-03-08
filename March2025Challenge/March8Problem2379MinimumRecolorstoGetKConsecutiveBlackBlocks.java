/* 2379. [Easy] Minimum Recolors to Get K Consecutive Black Blocks */
public class March8Problem2379MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        
    }
    public int minimumRecolors(String blocks, int k) {
        int blackCount = 0, ans = Integer.MAX_VALUE;
      
          for (int i = 0; i < blocks.length(); i++) {
              if (i - k >= 0 && blocks.charAt(i - k) == 'B') blackCount--;
              if (blocks.charAt(i) == 'B') blackCount++;
              ans = Math.min(ans, k - blackCount);
          }
          
          return ans;  
      }
}
