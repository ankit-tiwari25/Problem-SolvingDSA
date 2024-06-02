package JuneChallenge;
// 3110. Score of a String
// Date : 1 June 2024
public class ScoreofaString {
    public static void main(String[] args) {
        
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        char[] arr = s.toCharArray();

        int score = 0;
        for(int i = 0; i < s.length()-1; i++){
            int val = Math.abs((int)arr[i] - (int)arr[i+1]);
            score = score + val;
        }
        return score;
    }
}
