public class L0024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;

        while(cur.next != null && cur.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;

            cur.next = second;
            first.next = second.next;
            second.next = first;
            cur = cur.next.next;
        }
        return dummy.next;
    }
}
