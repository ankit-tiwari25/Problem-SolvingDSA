package March2025Challenge;
/* 2460.[Easy] Apply Operations to an Array */
public class March1Problem2460ApplyOperationstoanArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,0};
        display(applyOperations(arr));

    }
    public static int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        int i;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] != 0){
                if(nums[i] == nums[i + 1]){
                    result[count] = nums[i] * 2;
                    i++;
                }
                else{
                    result[count] = nums[i];
                }
                count++;
            }
        }
        if(i != nums.length){
            result[count] = nums[nums.length - 1];
        }
        return result; 
    } 
}
