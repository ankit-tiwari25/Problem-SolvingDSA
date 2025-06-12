/* 3423.[Easy] Maximum Difference Between Adjacent Elements in a Circular Array */
public class Jun12Problem3423MaximumDifferenceBetweenAdjacentElementsinaCircularArray {
    public static void main(String[] args) {
        
    }
    public int maxAdjacentDistance(int[] nums) {
        int maxi = 0;
        for (int i = 0; i < nums.length - 1; i++)
            maxi = Math.max(maxi, Math.abs(nums[i + 1] - nums[i]));
        maxi = Math.max(maxi, Math.abs(nums[nums.length - 1] - nums[0]));
        return maxi;  
    }
}
