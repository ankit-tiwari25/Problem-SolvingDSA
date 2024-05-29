package RandomQuestions;
// 1404. [Medium] Number of Steps to Reduce a Number in Binary Representation to One

public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
   public static void main(String[] args) {
    String s = "1111011110000011100000110001011011110010111001010111110001";
    int num = convertToInteger(s);
    System.out.println(num);
    System.out.println(countStepsToReachOne(num));
   } 
   public static int countStepsToReachOne(int n){
    int count = 0;
       while(n != 1){
        if(n % 2 == 0){
            n = n / 2;
            count++;
        }else{
            n = n + 1;
            count++;
        }
       }
       return count;
   }
   public static int convertToInteger(String s){
        int n = 0;
        char[] arr = s.toCharArray();
        for(int i = s.length()-1,  j = 0; i >= 0; i--, j++){
                if(arr[i] == '1'){
                   n = n +  (int)Math.pow(2,j);
                }
        }
        return n;
   }
}
