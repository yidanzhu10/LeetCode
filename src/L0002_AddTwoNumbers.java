public class L0002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;//进位
        while(l1 != null || l2 != null) {
            // get current number
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            // get the sum of two numbers and update carry
            int sum = num1 + num2 + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            //move to next node
            curr = curr.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry != 0){
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
