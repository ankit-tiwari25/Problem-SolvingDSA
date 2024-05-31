package RandomQuestions;
// 303 [Easy]. Range Sum Query - Immutable

public class RangeSumQueryImmutable {
    int[] nums;
    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
  public static void main(String[] args) {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    RangeSumQueryImmutable obj = new RangeSumQueryImmutable(nums);
    int sum = obj.sumRange(0, nums.length-1);
    System.out.println(sum);
  }  
}
