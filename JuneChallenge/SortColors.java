package JuneChallenge;
// 75. [Medium] Sort Colors
// 12th June 2024
// Look for another method
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        display(nums);
    }
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for(int i : nums){
            if(i == 0){
                red++;
            }else if(i == 1){
                white++;
            }else{
                blue++;
            }
        }

        int i = 0;
        while(red != 0){
            nums[i]  = 0;
            red--;
            i++;
        }

        while(white != 0){
            nums[i] = 1;
            white--;
            i++;
        }

        while(blue != 0){
            nums[i] = 2;
            blue--;
            i++;
        }
    }
    public static void display(int[] list){
        for(int st : list){
            System.out.print(st + " ");
        }

    }
}
