/* 2942. Find Words Containing Character */

import java.util.ArrayList;
import java.util.List;

public class May24Problem2942FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[]  words = {"leet","code"};
        String x = "e";
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans =new ArrayList<>();

        int i = 0;
        for(String word : words){
            if(word.contains(x+"")){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}
