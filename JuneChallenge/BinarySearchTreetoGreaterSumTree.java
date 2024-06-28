package JuneChallenge;

import javax.swing.tree.TreeNode;

// 1038. Binary Search Tree to Greater Sum Tree
//25th June 2024
// BST Revisit Required

public class BinarySearchTreetoGreaterSumTree {
    private static int sum = 0;
    public static void main(String[] args) {
        
    }
      
    public static TreeNode bstToGst(TreeNode root) {
          if (root != null) {
            bstToGst(root.right);  // Traverse the right subtree
            sum += root.val;  // Update the sum
            root.val = sum;  // Update the current node's value
            bstToGst(root.left);  // Traverse the left subtree
        }
        return root;
    }
}
