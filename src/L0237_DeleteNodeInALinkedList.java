public class L0237_DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        if(node.next == null) node = null;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
