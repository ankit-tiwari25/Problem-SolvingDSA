package JuneChallenge;
// 826. [Medium] Most Profit Assigning Work
// 18th June 2024
// TODO : Revisit Required

import java.util.ArrayList;
import java.util.List;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
       int[] difficulty = {2,4,6,8,10};
       int[] profit = {10,20,30,40,50};
       int[] worker = {4,5,6,7};

       System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
     public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
          List<int[]> infos = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            infos.add(new int[]{difficulty[i], profit[i]});
        }
        infos.sort((a, b) -> a[0] - b[0]);
        
        List<int[]> maxProfitForDifficulty = new ArrayList<>();
        int maxp = 0;
        for (int[] info : infos) {
            int d = info[0], p = info[1];
            maxp = Math.max(maxp, p);
            maxProfitForDifficulty.add(new int[]{d, maxp});
        }
        
        int totalProfit = 0;
        for (int w : worker) {
            int ind = binarySearch(maxProfitForDifficulty, w);
            if (ind >= 0 && w >= maxProfitForDifficulty.get(ind)[0]) {
                totalProfit += maxProfitForDifficulty.get(ind)[1];
            }
        }
        return totalProfit;
    }
     private static int binarySearch(List<int[]> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid)[0] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}

