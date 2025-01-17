package January2025Challenge;
/* 2683. [Medium] Neighboring Bitwise XOR */
public class Jan17Problem2683NeighboringBitwiseXOR {
    public static void main(String[] args) {
        
    }
    public static boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
       int[] org=new int[n];

       //Populating the org array
       for(int i=1; i<n; i++){
           org[i]=derived[i-1]^org[i-1];
       }

       //Validating the rules for index i
       for(int i=0; i<n; i++){
           int idx=(i+1)%n;
           if(derived[i]!=(org[i]^org[idx])) return false;
       }

       return true;   
   }
}
