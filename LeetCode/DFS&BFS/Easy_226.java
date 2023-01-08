/**
 * Created at 2023-01-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/path-sum/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_226 {
    public static void main(String[] args) {

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        System.out.println(invertTree(q));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        invertTree(root.right);
        invertTree(root.left);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right =  temp;
        return root;
    }
}
