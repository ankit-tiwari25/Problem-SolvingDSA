package JuneChallenge;
// 974.[Medium] Subarray Sums Divisible by K
// 9th June 2024
public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int nums[] = {-6,1,-5,10};
        int k = 9;
        System.out.println(subarraysDivByK(nums, k));

    }
    public static int subarraysDivByK(int[] nums, int k) {
        int count  = 0;
        int n = nums.length;
        int pf[] = new int[n];

        pf[0] = nums[0];
        for(int i = 1; i < n; i++){
            pf[i] = nums[i] + pf[i-1];
        }

        System.out.println("pf array");
        display(pf);

        
        for(int i : pf){
            if((i == 0) || (i % k == 0)){
                count++;
            }
        }

        System.out.println("count + " + count);

        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum = pf[j] - pf[i];
                if(sum % k == 0){
                    count++;
                    System.out.println("i + " + i + " j = " + j);
                }
            }
        }

        return count;
        
    }
    public static void display(int[] nums){
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
