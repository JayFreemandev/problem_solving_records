

public class problem_617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode result = new TreeNode(root1.val + root2.val);
        result.left = mergeTrees(root1.left, root2.left);
        result.right = mergeTrees(root1.right, root2.right);
        return  result;
    }

    public static void main(String[] args) {

        TreeNode root1r = new TreeNode(2, null,null );
        TreeNode root2l = new TreeNode(5, null, null);
        TreeNode root1l = new TreeNode(3, root2l, null);
        TreeNode root1 = new TreeNode(1, root1l, root1r);

        TreeNode rootB2r = new TreeNode(4, null, null);
        TreeNode rootB2rr = new TreeNode(7, null, null);
        TreeNode rootB1r = new TreeNode(3, null,rootB2rr );
        TreeNode rootB1l = new TreeNode(1, null, rootB2r);
        TreeNode rootB = new TreeNode(2, rootB1l, rootB1r);

        problem_617 problem_617 = new problem_617();
        TreeNode result = problem_617.mergeTrees(root1, rootB);
        System.out.println(result);
    }
}
