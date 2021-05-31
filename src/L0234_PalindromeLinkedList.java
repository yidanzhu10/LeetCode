public class L0234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode mid = getMid(head);
        ListNode midNext = reverse(mid.next);

        while(midNext != null) {
            if(head.val == midNext.val){
                head = head.next;
                midNext = midNext.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    private ListNode getMid(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
