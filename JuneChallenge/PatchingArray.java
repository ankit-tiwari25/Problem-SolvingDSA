package JuneChallenge;

// 330. [Hard] Patching Array  - {Google}
// 16th June 2024
// Codewithmik ka solution
public class PatchingArray {
    public static void main(String[] args) {
        int nums[] = {1,5,10};
        int n = 20;

        System.out.println(minPatches(nums, n));
    }
    public static int minPatches(int[] nums, int n) {
        int patch = 0;
        long maxReach = 0;
        int i = 0;

        while(maxReach < n){
            if( i < nums.length && nums[i] <= (maxReach + 1)){
                maxReach = maxReach + nums[i];
                i++;
            }else{
                // maxReach + 1 wale element ko patch kiya
            //to new maxReach = purana max Reach + (purana max Reach + 1);
                maxReach = maxReach + (maxReach + 1);
                patch++;
            }
        }
        return patch;
    }
}
