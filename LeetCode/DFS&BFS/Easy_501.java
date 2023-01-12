import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created at 2023-01-13
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/binary-tree-paths/
 * Level -> EASY
 * Topic -> DFS/BFS
 */
public class Easy_501 {

    static int maxCount = 1;
    public static void main(String[] args) {
        TreeNode qleft =  new TreeNode(2,null, null);
        TreeNode qright =  new TreeNode(2,qleft, null);
        TreeNode q = new TreeNode(1,null, qright);
        findMode(q);
    }

    private static int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        findMode(root, map);

        int[] result = new int[map.size()];
        int index = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == maxCount){
                result[index++] = key;
            }
        }
        return Arrays.copyOf(result, index);
    }

    private static void findMode(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;

        if(map.containsKey(root.val)){
            int count =  map.get(root.val)+1;
            map.put(root.val, count);
            maxCount = Math.max(maxCount, count);
        }else{
            map.put(root.val, 1);
        }

        findMode(root.left, map);
        findMode(root.right, map);
    }
}
