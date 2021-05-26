public class L0160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
//            a = a == null ? headB : headA;
            if(a == null) a = headB;
            else a = a.next;
            if(b == null) b = headA;
            else b = b.next;
        }
        return a;
    }
}
