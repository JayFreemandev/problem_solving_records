/**
 * Created at 2023-01-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/path-sum/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_112 {
    public static void main(String[] args) {

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        System.out.println(hasPathSum(q,5));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.left == null && root.right== null && root.val == targetSum){
            return true;
        }

        if(hasPathSum(root.left, targetSum-root.val)  || hasPathSum(root.right, targetSum-root.val)){
            return true;
        }else{
            return false;
        }
    }
}
