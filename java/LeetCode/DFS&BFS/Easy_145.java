import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2023-01-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/path-sum/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_145 {
    public static void main(String[] args) {

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        System.out.println(postorderTraversal(q));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return postOrder(root, result);
    }

    public static List<Integer> postOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return result;
        }

        postOrder(root.left, result);
        postOrder(root.right, result);

        result.add(root.val);

        return result;
    }
}
