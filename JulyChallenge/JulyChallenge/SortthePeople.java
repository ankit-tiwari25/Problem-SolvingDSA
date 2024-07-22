package JulyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2418. [Easy] Sort the People
public class SortthePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        String[] ans = sortPeople(names, heights);
        for(String s : ans){
            System.out.println(s);
        }


    }
    public  static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> mapping = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            mapping.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        for (int i = 0; i < n / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; ++i) {
            names[i] = mapping.get(heights[i]);
        }

        return names;
    }
}
