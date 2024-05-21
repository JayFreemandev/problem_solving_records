import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2023-01-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_144 {
    public static void main(String[] args) {

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        System.out.println(preorderTraversal(q));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preOrder(root, result);
    }

    public static List<Integer> preOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return result;
        }

        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);

        return result;
    }
}
