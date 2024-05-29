package PrefixSum;

public class EquilibriumIndex{
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println(equilibriumIndex(arr));
    }
    public static int equilibriumIndex(int[] arr){
        System.out.println("Array");
        displayArray(arr);
        int count = 0;
        int n = arr.length;
        int[] lsum = new int[n];
        lsum[0] = 0;
        for(int i = 1; i < n; i++){
            lsum[i] = lsum[i  - 1] + arr[i - 1];
        }

        System.out.println("L-SUM");
        displayArray(lsum);

        int[] rsum = new int[n];
        rsum[n-1] = 0;
        for(int i = n - 2; i >= 0; i--){
            rsum[i] = rsum[i + 1] + arr[i + 1];
        }
        System.out.println("R-SUM");
        displayArray(rsum);

        for(int i = 0; i < n; i++){
            if(lsum[i] == rsum[i]){
                count++;
            }
        }

        return count;
    }

    public static void displayArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}