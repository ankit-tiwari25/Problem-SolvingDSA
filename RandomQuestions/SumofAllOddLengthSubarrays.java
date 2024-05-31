package RandomQuestions;
// 1588. [Easy] Sum of All Odd Length Subarrays
public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(nums));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] pfsum = new int[n];
        pfsum[0] = arr[0];
        for(int i = 1; i < n; i++){
            pfsum[i] = arr[i] + pfsum[i-1];
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            if(i == 0 || i % 2 == 0){
                sum = sum + pfsum[i];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((i + j) % 2 != 0){
                    int diff = pfsum[j] - pfsum[i];
                    sum = sum + diff;
                }
            }
        }

        return sum;
    }
}
