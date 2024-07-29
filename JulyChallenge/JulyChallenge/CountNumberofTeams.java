package JulyChallenge;

// 1395. [Medium] Count Number of Teams
public class CountNumberofTeams {
    public static void main(String[] args) {
        int rating[] = {2,5,3,4,1};
        System.out.println(numTeams(rating));

    }
    public static int numTeams(int[] rating) {
        int n = rating.length;
      if (n < 3) return 0;

      int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
      for (int num : rating) {
          min = Math.min(min, num);
          max = Math.max(max, num);
      }
      
      int[] leftTree = new int[max - min + 2];
      int[] rightTree = new int[max - min + 2];
      
      for (int num : rating) {
          update(rightTree, num - min, 1);
      }
      
      int count = 0;
      for (int i = 0; i < n; i++) {
          update(rightTree, rating[i] - min, -1);
          
          int lessLeft = query(leftTree, rating[i] - min - 1);
          int greaterLeft = i - lessLeft;
          
          int lessRight = query(rightTree, rating[i] - min - 1);
          int greaterRight = (n - i - 1) - lessRight;
          
          count += lessLeft * greaterRight + greaterLeft * lessRight;
          
          update(leftTree, rating[i] - min, 1);
      }
      
      return count;
  }
   private static void update(int[] tree, int index, int value) {
      index++;
      while (index < tree.length) {
          tree[index] += value;
          index += index & (-index);
      }
  }

  private static int query(int[] tree, int index) {
      int sum = 0;
      index++;
      while (index > 0) {
          sum += tree[index];
          index -= index & (-index);
      }
      return sum;
  }
}

