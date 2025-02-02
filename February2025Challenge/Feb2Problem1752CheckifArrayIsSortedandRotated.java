package February2025Challenge;

/* 1752.[Easy] Check if Array Is Sorted and Rotated */
public class Feb2Problem1752CheckifArrayIsSortedandRotated {
  public static void main(String[] args) {
    int[] nums = {3,4,5,1,2};
  }  
  public static boolean check(int[] nums) {
    int count=0;
  for(int i=0;i<nums.length-1;i++){
      if(nums[i]>nums[i+1]){
          count++;
      }
  }
  if(nums[0]<nums[nums.length-1]){
      count++;
  }
  return count<=1;
}
}
