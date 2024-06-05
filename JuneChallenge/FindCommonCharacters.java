package JuneChallenge;
// 1002. [Easy] Find Common Characters
//5th june 2024

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> ans = commonChars(words);
        System.out.println(ans);
        display(ans);

    }
     public static List<String> commonChars(String[] words) {
        int[] ansFreq = new int[26];

        // Check freq for first word
        String firstWord = words[0];
        char[] firstWordArray = firstWord.toCharArray();
        int[] tempFreqFirst = new int[26];
        for(char ch : firstWordArray){
            tempFreqFirst[ch-'a']++;
        }

        for(int i = 0; i < 26; i++){
            ansFreq[i] = tempFreqFirst[i];
        }

        for(String st : words){
            int[] tempFreq = new int[26];
            char[] stArray = st.toCharArray();

            for(char c : stArray){
                tempFreq[c - 'a']++;
            }

            for(int i = 0; i < 26; i++){
                ansFreq[i] = Math.min(ansFreq[i], tempFreq[i]);
            }
        }

        //Convert ansFreq char array to desired output

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            int count = ansFreq[i];
            char ch = (char)(i + 'a');
            while(count != 0){
                ans.add(""+ch);
                count--;
            }
        }

        return ans;
    }

    public static void display(List<String> list){
        for(String st : list){
            System.out.print(st + " ");
        }

    }
}
