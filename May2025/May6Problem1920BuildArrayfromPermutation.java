package May2025;
/* 1920.[Easy] Build Array from Permutation */
public class May6Problem1920BuildArrayfromPermutation {
    public static void main(String[] args) {
        
    }
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
