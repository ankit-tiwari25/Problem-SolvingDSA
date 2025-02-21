public class Feb21Problem1261FindElementsinaContaminatedBinaryTree {
    TreeNode groot;
    public FindElements(TreeNode root) {
         if(root!=null && root.val==-1){
            root.val=0;                
        }
        solve1(root);   
        groot=root;  
    }
    void printTree(TreeNode node){
        if(node==null){ 
            System.out.print(" null ");
            return;
        }

        System.out.print(" "+node.val);
        printTree(node.left);
        printTree(node.right);
    }
}
