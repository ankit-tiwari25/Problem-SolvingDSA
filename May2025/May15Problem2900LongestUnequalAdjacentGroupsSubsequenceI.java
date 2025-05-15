/* 2900. [Easy] Longest Unequal Adjacent Groups Subsequence I */

import java.util.ArrayList;
import java.util.List;

public class May15Problem2900LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};
        System.out.println();
    }
    public static  List<String> getLongestSubsequence(String[] words, int[] groups) {
         List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < groups.length; ++i) {
            if (groups[i] != groups[i - 1]) {
                res.add(words[i]);
            }
        }
        return res; 
    }
}
