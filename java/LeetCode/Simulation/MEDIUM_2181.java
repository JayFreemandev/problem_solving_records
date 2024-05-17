/**
 * Created at 2022-12-24
 * Site -> LINKEDIN
 * Link -> https://leetcode.com/problems/merge-nodes-in-between-zeros/
 * Level -> EASY
 * Topic -> SIMULATION
 */
public class MEDIUM_2181 {
    public static void main(String[] args) {
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode mergeNodes(ListNode head) {
        ListNode curr = new ListNode();
        ListNode root = curr;
        int sum = 0;
        while (head != null) {
            if (head.val == 0 && sum != 0) {
                curr.val = sum;
                if (head.next == null) break;
                ;
                curr.next = new ListNode();
                curr = curr.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;

        }
        return root;
    }
}
