package udemy;

public class L19_RemoveNthNodeFromEndOfNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;

        while(right.next != null) {
            right = right.next;
            if(n -- <= 0){ //corner case
                left = left.next;
            }
        }
        left.next = left.next.next;

        return dummy.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
