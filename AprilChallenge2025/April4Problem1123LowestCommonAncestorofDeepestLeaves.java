package AprilChallenge2025;
/* 1123.[Medium] Lowest Common Ancestor of Deepest Leaves */
public class April4Problem1123LowestCommonAncestorofDeepestLeaves {
    public static void main(String[] args) {
        
    }
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
