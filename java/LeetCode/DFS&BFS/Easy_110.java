/**
 * Created at 2023-01-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/balanced-binary-tree/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_110 {
    public static void main(String[] args) {

        TreeNode qright3 =  new TreeNode(60,null, null);
        TreeNode qright2 =  new TreeNode(40,qright3, null);
        TreeNode qright =  new TreeNode(20,qright2, null);

        TreeNode qleft3 =  new TreeNode(15,null, null);
        TreeNode qleft2 =  new TreeNode(12,qleft3, null);
        TreeNode qleft =  new TreeNode(9,qleft2, null);
        TreeNode q = new TreeNode(3,qleft, qright);

        System.out.println(isBalanced(q));
    }

    public static boolean isBalanced(TreeNode root) {
        return height(root) == -1 ? false : true;
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
