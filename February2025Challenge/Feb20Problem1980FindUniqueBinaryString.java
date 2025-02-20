/* 1980.[Medium] Find Unique Binary String */
public class Feb20Problem1980FindUniqueBinaryString {
    public static void main(String[] args) {
        String[] nums = {"01","10"};
    }
    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
       for (int i = 0; i < nums.length; i++) {
           if (nums[i].charAt(i) == '0') {
               result.append('1');
           } else {
               result.append('0');
           }
       }
       return result.toString(); 
   }
}
