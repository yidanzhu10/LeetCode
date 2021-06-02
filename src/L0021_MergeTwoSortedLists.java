public class L0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while(l1 != null || l2 != null) {
            int x = l1 == null ? Integer.MAX_VALUE : l1.val;
            int y = l2 == null ? Integer.MAX_VALUE : l2.val;

            if(x < y) {
                cur.next = new ListNode(x);
                l1 = l1.next;
            } else {
                cur.next = new ListNode(y);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
