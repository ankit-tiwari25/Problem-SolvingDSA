/* 2176.[Easy] Count Equal and Divisible Pairs in an Array */
public class April17Problem2176CountEqualandDivisiblePairsinanArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
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
