package March2025Challenge;

/* 2560.[Medium] House Robber IV */
public class March15Problem2560HouseRobberIV {
    private boolean canStealKHouses(int[] nums, int k, int capability) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= capability) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= k;
    }
}
