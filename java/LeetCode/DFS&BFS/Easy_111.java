/**
 * Created at 2023-01-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/balanced-binary-tree/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_111 {
    public static void main(String[] args) {

        TreeNode qright3 =  new TreeNode(60,null, null);
        TreeNode qright2 =  new TreeNode(40,qright3, null);
        TreeNode qright =  new TreeNode(20,qright2, null);

        TreeNode qleft3 =  new TreeNode(15,null, null);
        TreeNode qleft2 =  new TreeNode(12,qleft3, null);
        TreeNode qleft =  new TreeNode(9,qleft2, null);
        TreeNode q = new TreeNode(3,qleft, qright);

        System.out.println(minDepth(q));
    }

    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }else {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
