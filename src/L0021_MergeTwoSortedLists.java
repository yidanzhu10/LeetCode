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
    public ListNode mergeTwoLists_recursion(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists_recursion(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists_recursion(l1, l2.next);
            return l2;
        }
    }
}
