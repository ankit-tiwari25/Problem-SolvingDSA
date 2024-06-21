package JuneChallenge;
// 1052. Grumpy Bookstore Owner
// 21 June 2024
// Sliding window
public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxUnsat = 0;
        int n = customers.length;

        int currUnsat = 0;

        for(int i = 0; i < minutes; i++){
            currUnsat += customers[i] * grumpy[i];
        }

        maxUnsat = currUnsat;

        int i = 0;
        int j = minutes;

        while(j < n){
            currUnsat += customers[j] * grumpy[j];
            currUnsat -= customers[i] * grumpy[i];

            maxUnsat = Math.max(maxUnsat, currUnsat);
            i++;
            j++;
        }

        int totalSat = maxUnsat;
        for(int p = 0; p < n; p++){
            if(grumpy[p] == 0){
                totalSat += customers[p];
            }
        }
        return totalSat;
    }
}
