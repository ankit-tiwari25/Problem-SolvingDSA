package InterviewPrep.StringQuestions;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        // String s = "the sky is blue";
        String s = "  hello world  ";
        System.out.println(reverseString(s));

    }
    public static char[] reverseCharacters(char[] str, int i, int j){
         // Reverse entire string
          
         while(i <= j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }
    public static String reverseString(String s){
        int n = s.length();
        char[] str = s.toCharArray();
        str = reverseCharacters(str, 0, n-1);
        int i = 0;
        int l = 0, r = 0;
        while(i < n){

            while( i < n && str[i] != ' '){
                str[r] = str[i];
                r++;
                i++;
            }else{
                
            }
        }


        StringBuffer ans = new StringBuffer("");
        return ans.toString();
    }
    // public static String reverseWords(String s) {
    //     String words[] = s.split(" ");
    //     int n = words.length;
    //     StringBuffer ans = new StringBuffer("");

    //     display(words);
    //     for(int i = n-1; i >0; i--){
    //         ans.append(words[i]);
    //         ans.append(" ");
    //     }
    //     ans.append(words[0]);

    //     return ans.toString();
    // }
    public static void display(String[] words){
        for(String i : words){
            System.out.println(i);
        }
    }
}
