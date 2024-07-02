package JulyChallenge;
// 1550. [Easy] Three Consecutive Odds
// 1 July 2024
//Sliding Window
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n < 3){
            return false;
        }
        int odd = 0;
        // first window
        for(int i = 0; i < 3; i++){
            if(arr[i] % 2 != 0){
                odd++;
            }
        }

        if(odd == 3){
            return true;
        }
        int i = 0; 
        int j = 3;
        while(j < n){
            if(arr[i] % 2 != 0){
                odd--;
            }
            if(arr[j] % 2 != 0){
                odd++;
            }
            if(odd == 3){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
