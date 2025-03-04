package DecemberChallenge;
/*
 *  2940. [Hard] Find Building Where Alice and Bob Can Meet
 */
public class December22Problem2940FindBuildingWhereAliceAndBobCanMeet {
    public static void main(String[] args) {
        int[] heights = {6,4,8,5,2,7};
        int[][] queries = {{0,1},{0,3},{2,4},{3,4},{2,2}};
        int[] ans = leftmostBuildingQueries(heights, queries);
        display(ans);

    }
    public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length;
        int[][] st = new int[n][20];
        int[] Log = new int[n + 1];
        Log[0] = -1;
        
        for (int i = 1; i <= n; i++) {
            Log[i] = Log[i >> 1] + 1;
        }

        for (int i = 0; i < n; i++) {
            st[i][0] = heights[i];
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 0; j + (1 << i) <= n; j++) {
                st[j][i] = Math.max(st[j][i - 1], st[j + (1 << (i - 1))][i - 1]);
            }
        }

        int[] res = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            if (l > r) {
                int temp = l;
                l = r;
                r = temp;
            }

            if (l == r) {
                res[i] = l;
                continue;
            }

            if (heights[r] > heights[l]) {
                res[i] = r;
                continue;
            }

            int maxHeight = Math.max(heights[l], heights[r]);
            int left = r + 1, right = n, mid;

            while (left < right) {
                mid = (left + right) / 2;
                int k = Log[mid - r + 1];
                int maxInRange = Math.max(st[r][k], st[mid - (1 << k) + 1][k]);

                if (maxInRange > maxHeight) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            res[i] = (left == n) ? -1 : left;
        }

        return res; 
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
