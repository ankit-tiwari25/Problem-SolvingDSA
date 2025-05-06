package May2025;
/* 1920.[Easy] Build Array from Permutation */
public class May6Problem1920BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = buildArray(nums);
    }
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print( " " + i);
        }
        System.out.println();
    }
}
