package JuneChallenge;
// 995. [Hard] Minimum Number of K Consecutive Bit Flips
// Sliding window
// 24th June 2024

public class MinimumNumberofKConsecutiveBitFlips {
    public static void main(String[] args) {
        int nums[] = {0,0,0,1,0,1,1,0};
        int k = 3;
        System.out.println(minKBitFlips(nums, k));
    }
    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length, flipped = 0, res = 0;
       int[] isFlipped = new int[n];
       for (int i = 0; i < nums.length; ++i) {
           if (i >= k)
               flipped ^= isFlipped[i - k];
               if (flipped == nums[i]) {
                   if (i + k > nums.length)
                       return -1;
               isFlipped[i] = 1;
               flipped ^= 1;
               res++;
           }
       }
       return res;
   }
}
