package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
/*
 * Count of Occurences of All Anagrams
 */
public class CountOccurencesOfAnagrams {
    public static void main(String[] args) {
        // String txt = "forxxorfxdofr";
        // String ptr = "for";

        String txt = "aabaabaa";
        String ptr = "aaba";
        System.out.println(countOccurencesOfAnagrams(txt, ptr));
    }
    public static int countOccurencesOfAnagrams(String txt, String ptr){
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int uniqueChar = 0;
    
        int n = txt.length();
        for(char ch : ptr.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
                uniqueChar++;
            }
        }
        int i = 0, j = 0;
        int k = ptr.length();
        while (j < n) {
            char ch = txt.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                int val = map.get(ch);
                if(val == 0){
                    uniqueChar--;
                }
            }
            if((j - i + 1) < k){
                j++;
            }else if((j - i + 1) == k){
                if(uniqueChar == 0){
                    ans++;
                }
                char x = txt.charAt(i);
                if(map.containsKey(x)){
                    int val = map.get(x);
                    if(val == 0){
                        uniqueChar++;
                    }
                    map.put(x, val + 1);
                }
                i++;
                j++;
            }
            
        }
        return ans;
    }
}
