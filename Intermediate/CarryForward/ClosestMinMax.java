package CarryForward;

public class ClosestMinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,3,4,6,4,6,3};
        System.out.println(closestMinMax(arr));
    }
    public static int closestMinMax(int[] arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mini = -1;
        int maxi = -1;
        for(int i : arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }

        System.out.println(max + " " + min);

        if(max == min){
            return 1;
        }
        for(int i = n-1; i >= 0; i--){
            if(arr[i] == min){
                mini = i;
                if(maxi != -1){
                    int len = maxi > mini ? (maxi - mini) + 1 : (mini - maxi) + 1;
                    ans = Math.min(ans, len);
                }
            }
            if(arr[i] == max){
                maxi = i;
                if(mini != -1){
                    int len = maxi > mini ? (maxi - mini) + 1 : (mini - maxi) + 1;
                    ans = Math.min(ans,len);
                }
            }
        }
        return ans;
    }
}
