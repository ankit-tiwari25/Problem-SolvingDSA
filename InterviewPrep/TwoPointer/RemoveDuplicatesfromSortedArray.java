package InterviewPrep.TwoPointer;
// 26. [Easy] Remove Duplicates from Sorted Array
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while(j < n){
            if(nums[i] == nums[j]) {
                j++;
            }else{
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }

        display(nums);
        return i + 1;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.err.print(i + " ");
        }
        System.out.println();
    }
}
