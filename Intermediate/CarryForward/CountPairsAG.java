package CarryForward;

public class CountPairsAG {
    public static void main(String[] args) {
        String a = "baagdcag";
        char[] arr = a.toCharArray();
        System.out.println(countPairsAG(arr));
    }

    public static int countPairsAG(char[] arr){
        int n = arr.length;
        int ans = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a'){
                count++;
            }
            if(arr[i] == 'g'){
                ans += count;
            }
        }

        return ans;
    }
}
