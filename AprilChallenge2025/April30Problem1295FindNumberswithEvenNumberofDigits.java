/* 1295.[Easy] Find Numbers with Even Number of Digits */
public class April30Problem1295FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        
    }
    public int findNumbers(int[] nums) {
        int count = 0;
       for (int i : nums) {
           if ((i >= 10 && i < 100) || (i >= 1000 && i < 10000) || i == 100000) {
               count++;
           }
       }
       return count;  
   }
}
