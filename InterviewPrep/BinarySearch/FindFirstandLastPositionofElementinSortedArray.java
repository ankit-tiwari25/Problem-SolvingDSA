package InterviewPrep.BinarySearch;

// 34.[Medium] Find First and Last Position of Element in Sorted Array
public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        display(ans);
    }

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];

        ans[0] = findLeft(nums,target);
        ans[1] = findRight(nums, target);

        return ans;
    }
    public static int findLeft(int[] nums, int target){
        int n = nums.length;
        int leftMost = -1;
        int l = 0;
        int r = n-1;

        while( l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                leftMost = mid;
                r = mid - 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return leftMost;
    }
      public static int findRight(int[] nums, int target){
        int n = nums.length;
        int rightMost = -1;
        int l = 0;
        int r = n-1;

        while( l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                rightMost = mid;
                l = mid + 1;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return rightMost;
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
