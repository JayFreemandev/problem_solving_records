/**
 * Created at 2023-01-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_101 {
    public static void main(String[] args) {

        TreeNode qleft2 =  new TreeNode(4,null, null);
        TreeNode qright2 =  new TreeNode(3,null, null);
        TreeNode qright =  new TreeNode(2,qleft2, qright2);

        TreeNode pright =  new TreeNode(4,null, null);
        TreeNode pleft =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,pleft, pright);
        TreeNode q = new TreeNode(1,qleft, qright);
        isSymmetric(q);
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || symmetricCheck(root.left, root.right);
    }

    private static boolean symmetricCheck(TreeNode q, TreeNode p){
        if(p == null && q == null){
            return true;
        }

        if((p == null || q == null) || (p.val != q.val)){
            return false;
        }

        return symmetricCheck(p.left, q.right) && symmetricCheck(p.right, q.left);
    }
}
