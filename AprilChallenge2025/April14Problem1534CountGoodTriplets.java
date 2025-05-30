/* 1534. [Easy] Count Good Triplets */
public class April14Problem1534CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, count = 0;
   
           for(int i = 0; i < n - 2; i++) {
               for(int j = i + 1; j < n - 1; j++) {
                   if(Math.abs(arr[i] - arr[j]) <= a){
                       for(int k = j + 1; k < n; k++) {
                           if(Math.abs(arr[j] - arr[k]) <= b &&
                           Math.abs(arr[i] - arr[k]) <= c) count++;
                       }
                   }
               }
           }
           
           return count;   
       }
}
