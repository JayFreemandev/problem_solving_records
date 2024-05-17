import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created at 2023-01-05
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_94 {
    public static void main(String[] args) {
        TreeNode left2 =  new TreeNode(3,null, null);
        TreeNode left =  new TreeNode(2,left2, null);
        TreeNode treeNode = new TreeNode(1,null, left);
        inorderTraversal(treeNode);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // method 2: iteration
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
    }
}
