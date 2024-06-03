package JuneChallenge;
// 2486. Append Characters to String to Make Subsequence
// June 3- 2024
public class AppendCharacterstoStringtoMakeSubsequence {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s, t));
    }
    public static int appendCharacters(String s, String t){
        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }

        }

        return n-j;
    }
}
