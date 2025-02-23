public class Feb23Problem889ConstructBinaryTreefromPreorderandPostorderTraversal {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] index = new int[]{0};
         return construct(preorder, postorder, index, 0, preorder.length - 1);  
     }
}
