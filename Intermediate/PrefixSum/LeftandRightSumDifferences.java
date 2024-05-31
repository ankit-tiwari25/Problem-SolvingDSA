package PrefixSum;
// 2574. [Easy] Left and Right Sum Differences
public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] ans = leftRightDifference(nums);
        displayArray(nums);
        displayArray(ans);
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int lsum[] = new int[n];
        int rsum[] = new int[n];

        lsum[0] = 0;
        rsum[n-1] = 0;
        for(int i = 1; i < n; i++){
            lsum[i] = lsum[i-1] + nums[i-1];
        }

        for(int i = n-2; i >= 0; i--){
            rsum[i] = rsum[i+1] + nums[i+1];
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int diff = Math.abs(lsum[i]-rsum[i]);
            ans[i] = diff;
        }

        return ans;
    }
    public static void displayArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
