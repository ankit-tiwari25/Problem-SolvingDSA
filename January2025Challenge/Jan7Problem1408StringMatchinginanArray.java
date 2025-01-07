package January2025Challenge;

import java.util.ArrayList;
import java.util.List;

/*
 *  1408. [Easy] String Matching in an Array
 */
public class Jan7Problem1408StringMatchinginanArray {
    public static void main(String[] args) {
       String[] words = {"mass","as","hero","superhero"};
       System.out.println(stringMatching(words)); 
    }
    public static List<String> stringMatching(String[] words) {
           int n = words.length;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
