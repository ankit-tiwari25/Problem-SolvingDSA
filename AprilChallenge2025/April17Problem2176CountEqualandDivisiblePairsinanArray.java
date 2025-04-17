/* 2176.[Easy] Count Equal and Divisible Pairs in an Array */
public class April17Problem2176CountEqualandDivisiblePairsinanArray {
    public static void main(String[] args) {
        
    }
    public static int countPairs(int[] nums, int k) {
        int pairs = 0;
          for (int i = 0; i < nums.length - 1; i++) {
              for (int j = i + 1; j < nums.length; j++) {
                  if (nums[i] == nums[j] && (i * j) % k == 0) {
                      pairs++;
                  }
              }
          }
          return pairs;  
      }
}
