package NeetCode150;
/*
 * 238. [Medium] Product of Array Except Self
 */
public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 4};
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        display(ans);
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = nums[i-1] * left[i-1];
        }

        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            right[i] = nums[i+1] * right[i+1];
        }

        for(int i = 0; i <n; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
    }
}
