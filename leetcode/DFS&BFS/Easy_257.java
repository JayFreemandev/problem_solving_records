import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2023-01-08
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/binary-tree-paths/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_257 {
    public static void main(String[] args) {

        TreeNode qright =  new TreeNode(3,null, null);
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode q = new TreeNode(1,qleft, qright);
        binaryTreePaths(q);
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List res = new ArrayList<>();

        if(root == null) return res;

        dfs(root, res, "");
        return res;
    }

    private static void dfs(TreeNode root, List ls, String accum) {
        if (root == null) return;

        accum += (accum.length() == 0 ? "" : "->") + root.val;

        if (root.left == null && root.right == null) {
            ls.add(accum);
            return;
        }

        dfs(root.left, ls, accum);
        dfs(root.right, ls, accum);
    }
}
