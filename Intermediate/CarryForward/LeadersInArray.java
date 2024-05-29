package CarryForward;
// Leaders in the array - element is a leader if it is greater than all the elements on RHS.
//  ar[n-1] is always a leader.
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {15,-1,7,4,2,5,2,3};
        System.out.println(leadersInArray(arr));
    }
    public static int leadersInArray(int[] arr){
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
    
}
