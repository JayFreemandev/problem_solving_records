
import java.util.*;
public class problem_226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public static void main(String[] args) {

        TreeNode root1r = new TreeNode(3, null,null );
        TreeNode root1l = new TreeNode(1, null, null);
        TreeNode root1 = new TreeNode(2, root1l, root1r);

        problem_226 problem_226 = new problem_226();
        TreeNode result = problem_226.invertTree(root1);
        System.out.println(result);

        Math.max(a,b);
    }
}
