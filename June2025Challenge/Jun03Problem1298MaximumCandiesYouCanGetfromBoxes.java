
/* 1298.[Hard] Maximum Candies You Can Get from Boxes */

import java.util.ArrayList;
import java.util.List;

public class Jun03Problem1298MaximumCandiesYouCanGetfromBoxes {
    public static void main(String[] args) {
      int[]  vis = {1,0,1,0}, candies = {7,5,4,100};
      int[][] keys = {{},{},{1},{}}, containedBoxes = {{1,2},{3},{},{}};
      int[] initialBoxes = {0};
    }
     public static int maxCandies(int[] vis, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
         boolean foundOpenable = true;
        int totalCandies = 0;
        List<Integer> boxes = new ArrayList<>();
        for (int b : initialBoxes) boxes.add(b);
        while (!boxes.isEmpty() && foundOpenable) {
            foundOpenable = false;
            List<Integer> nextBoxes = new ArrayList<>();
            for (int boxId : boxes) {
                if (vis[boxId] == 1) {
                    foundOpenable = true;
                    for (int k : containedBoxes[boxId]) nextBoxes.add(k);
                    for (int keyId : keys[boxId]) vis[keyId] = 1;
                    totalCandies += candies[boxId];
                } else {
                    nextBoxes.add(boxId);
                }
            }
            boxes = nextBoxes;
        }
        return totalCandies;
    }
}
