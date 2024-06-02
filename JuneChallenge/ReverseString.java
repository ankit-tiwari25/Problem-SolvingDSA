package JuneChallenge;
// 344. [Easy] Reverse String
// Date : 2 June 2024
public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();
        reverseString(arr);
        displayArray(arr);
       
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    
    }
    public static void displayArray(char[] arr){
        for(char i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
