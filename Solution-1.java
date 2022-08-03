public class Solution {
    public ListNode reverseList (ListNode head) {
        ListNode res = null;
        while (head != null) {
            ListNode tmp = new ListNode(head.val);
            tmp.next = res;
            head = head.next;
            res = tmp;
        }
        return res;
    }
}
