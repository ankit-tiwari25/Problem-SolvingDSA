package AprilChallenge2025;

/* 3396. [Easy] Minimum Number of Operations to Make Elements in Array Distinct */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class April8Problem3396MinimumNumberofOperationstoMakeElementsinArrayDistinct {
    public static void main(String[] args) {
        
    }
     public static int minimumOperations(int[] nums) {
      int cnt = 0, temp;
        List<Integer> list = new ArrayList<>();
        for (int n : nums)
            list.add(n);
        while (true) {
            HashMap<Integer, Integer> mpp = new HashMap<>();
            temp = 0;
            for (int num : list)
                if (mpp.put(num, mpp.getOrDefault(num, 0) + 1) != null && mpp.get(num) == 2)
                    temp++;
            if (temp == 0)
                break;
            int removeCount = Math.min(3, list.size());
            for (int i = 0; i < removeCount; i++)
                list.remove(0);
            cnt++;
        }
        return cnt;   
    }
}
