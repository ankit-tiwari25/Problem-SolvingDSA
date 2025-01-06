package January2025Challenge;
/* 
 * 1769. [Medium] Minimum Number of Operations to Move All Balls to Each Box
 */
public class Jan6Problem1769MinimumNumberofOperationstoMoveAllBallstoEachBox {
    public static void main(String[] args) {
       String boxes = "110";
       display(minOperations(boxes));
    }
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
          int[] distances = new int[n];
  
          int prefixCount = 0;
          int prefixSum = 0;
  
          for (int i = 0; i < n; ++i) {
              distances[i] = prefixCount * i - prefixSum;
              if (boxes.charAt(i) == '1') {
                  ++prefixCount;
                  prefixSum += i;
              }
          }
  
          int suffixCount = 0;
          int suffixSum = 0;
  
          for (int i = n - 1; i >= 0; --i) {
              distances[i] += suffixSum - suffixCount * i;
              if (boxes.charAt(i) == '1') {
                  ++suffixCount;
                  suffixSum += i;
              }
          }
  
          return distances;  
      }
      public static void display(int[] arr){
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
      }
}
