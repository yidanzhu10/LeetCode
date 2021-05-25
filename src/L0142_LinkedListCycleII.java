public class L0142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
            // let the slow pointer be at the point they will meet
        }

        if(fast == null || fast.next == null) {
            return null;
        }
        fast = head;
        while(slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        /***
        m + k * n + y = 2(m + y);
        x + y = n; => m = (k - 1) n + x;
         ***/

        return slow;
    }
}
