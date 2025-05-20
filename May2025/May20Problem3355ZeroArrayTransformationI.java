/* 3355.[Medium] Zero Array Transformation I */
public class May20Problem3355ZeroArrayTransformationI {
    public static void main(String[] args) {
        
    }
     public static boolean isZeroArray(int[] nums, int[][] queries) {
          int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            diff[l]++;
            if (r + 1 < n) {
                diff[r + 1]--;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += diff[i];
            if (nums[i] > cnt) {
                return false;
            }
        }

        return true;
    }
}
