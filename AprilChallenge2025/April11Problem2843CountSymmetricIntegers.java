/* 2843.[Easy] Count Symmetric Integers */
public class April11Problem2843CountSymmetricIntegers {
    public static void main(String[] args) {
        
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0; 
 
         for (int num = low; num <= high; num++) {
             String str = Integer.toString(num); 
             int len = str.length();
 
             
             if (len % 2 != 0) continue;
 
             int half = len / 2;
             int leftSum = 0;
             int rightSum = 0;
 
            
             for (int i = 0; i < half; i++) {
                 leftSum += str.charAt(i) - '0';
             }
 
             // ➡️ Sum of the right half (last n digits)
             for (int i = half; i < len; i++) {
                 rightSum += str.charAt(i) - '0';
             }
 
             // ☯️ If chakra is balanced, count it
             if (leftSum == rightSum) {
                 count++;
             }
         }
 
         return count;  
     }
}
