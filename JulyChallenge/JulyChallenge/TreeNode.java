package JulyChallenge;

import java.util.*;
// 1110. Delete Nodes And Return Forest
// 17th July 2024
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    }
    
   

 class DeleteNodesAndReturnForest {
    public  static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Map<Integer, TreeNode> res = new HashMap<>();
      Set<Integer> to_delete_set = new HashSet<>();
      for (int val : to_delete) {
          to_delete_set.add(val);
      }
      res.put(root.val, root);

      recursion(null, root, false, res, to_delete_set);

      return new ArrayList<>(res.values());
  }
   private static void recursion(TreeNode parent, TreeNode cur_node, boolean isleft, Map<Integer, TreeNode> res, Set<Integer> to_delete_set) {
      if (cur_node == null) return;

      recursion(cur_node, cur_node.left, true, res, to_delete_set);
      recursion(cur_node, cur_node.right, false, res, to_delete_set);

      if (to_delete_set.contains(cur_node.val)) {
          res.remove(cur_node.val);

          if (parent != null) {
              if (isleft) {
                  parent.left = null;
              } else {
                  parent.right = null;
              }
          }

          if (cur_node.left != null) {
              res.put(cur_node.left.val, cur_node.left);
          }
          if (cur_node.right != null) {
              res.put(cur_node.right.val, cur_node.right);
          }
      }
   }
    public static void main(String[] args) {
        TreeNode root = {1,2,3,4,5,6,7};
        int[] to_delete = {3,5};

        List<TreeNode> ans = delNodes(root, to_delete);S
    }

}
