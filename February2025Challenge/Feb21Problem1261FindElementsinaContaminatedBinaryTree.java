public class Feb21Problem1261FindElementsinaContaminatedBinaryTree {
    TreeNode groot;
    public static void main(String[] args) {
        TreeNode obj = new TreeNode();
        
    }
    public void FindElements(TreeNode root) {
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
    void solve1(TreeNode node){
        if(node==null){
            return;
        }

        if(node.left !=null){
            node.left.val=2*node.val+1;                
        }
        if(node.right !=null){
            node.right.val=2*node.val+2;
        }

        solve1(node.left);
        solve1(node.right);

    }
}
