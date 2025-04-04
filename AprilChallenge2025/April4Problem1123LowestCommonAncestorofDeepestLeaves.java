package AprilChallenge2025;
/* 1123.[Medium] Lowest Common Ancestor of Deepest Leaves */
public class April4Problem1123LowestCommonAncestorofDeepestLeaves {
    public static void main(String[] args) {
        
    }
    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    private staticTreeNode dfs(TreeNode root, int maxi, int len) {
        if (root == null) return null;
        if (maxi - 1 == len) return root;
        TreeNode left = dfs(root.left, maxi, len + 1);
        TreeNode right = dfs(root.right, maxi, len + 1);
        
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxi = maxDepth(root); // maxi is the max depth
           return dfs(root, maxi, 0);   
       }
}
