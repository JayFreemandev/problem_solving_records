/**
 * Created at 2023-01-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_100 {
    public static void main(String[] args) {
/*        TreeNode pright =  new TreeNode(3,null, null);
        TreeNode pleft =  new TreeNode(2,null, null);
        TreeNode p = new TreeNode(1,pleft, pright);

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        isSameTree(p, q);*/
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        if((p == null || q == null) || (p.val != q.val)){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
