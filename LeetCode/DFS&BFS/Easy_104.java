/**
 * Created at 2023-01-07
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_104 {
    public static void main(String[] args) {

        TreeNode qleft2 =  new TreeNode(15,null, null);
        TreeNode qright2 =  new TreeNode(7,null, null);
        TreeNode qright =  new TreeNode(20,qleft2, qright2);

        TreeNode qleft =  new TreeNode(9,null, null);
        TreeNode q = new TreeNode(3,qleft, qright);
        System.out.println(maxDepth(q));
    }

    public static int maxDepth(TreeNode root) {

        int count = 0;

        if(root == null){
            return 0;
        }else{
            count = 1;
        }

        return Math.max(maxDepthCheck(root.left, count), maxDepthCheck(root.right, count));
    }

    private static int maxDepthCheck(TreeNode q, int count){
        if(q == null){
            return count;
        }

        count++;

        return Math.max(maxDepthCheck(q.left, count), maxDepthCheck(q.right, count));
    }
}
