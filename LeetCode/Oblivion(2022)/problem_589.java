class Solution {

    public int maxDepth(Node root) {
        if(root == null) return 0;

        int max = 1;

        for(Node node : root.children){
            max = Math.max(max, 1+maxDepth(node));
        }

        return max;
    }
}
