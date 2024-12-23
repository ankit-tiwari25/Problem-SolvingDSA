package DecemberChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 *   2471. [Medium] Minimum Number of Operations to Sort a Binary Tree by Level
 */
public class December23Problem2471MinimumNumberofOperationsToSortABinaryTreeByLevel {
    public static void main(String[] args) {
        
    }
     private static int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == ele)
                return i;

        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int minSwaps(int[] arr, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);

        for (int i = 0; i < N; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public static int minimumOperations(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;

        while (!q.isEmpty()) {
            TreeNode curr = q.peek();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                curr = q.remove();
                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            int[] arr = new int[q.size()];
            int k = 0;
            for (TreeNode num : q)
                arr[k++] = num.val;

            count += minSwaps(arr, k);
        }
        return count;
    }
}
