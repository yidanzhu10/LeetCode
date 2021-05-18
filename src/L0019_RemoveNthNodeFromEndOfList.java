public class L0019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // create a dummy head and link it to the given list
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i = 0; i <= n; i ++){
            first = first.next;
        }
        //make the distance between two pointers n steps
        while(first != null){
            first = first.next;
            second = second.next;
        } // keep the distance and move together
        second.next = second.next.next;
        // delete the node
        return dummy.next;
    }
}
