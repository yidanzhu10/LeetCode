package udemy;

import java.util.Iterator;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class L206_ReverseLinkedList {
    // Iteration
    public ListNode reverseList(ListNode head) {
        ListNode current = new ListNode();
        ListNode previous = new ListNode();
        ListNode nextNode = new ListNode();

        current = head;
        previous = null;

        while(current != null) {
            nextNode = current.next;
            current.next = previous;

            previous = current;
            current = nextNode;
        }

        return previous;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    // Recursion
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if(head == null) {
            return newHead; // Corner case if the head is null, then newHead is also null
        }

        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        head = next;

        return reverse(head, newHead);
    }
}