class MyLinkedList {

    // Define for singly ListNode
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode head;
    ListNode tail;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode node = head;
        while (index > 0) {
            node = node.next;
            index--;
        }
        return node.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        head = new ListNode(val, head);

        // 只有一个元素
        if (size++ == 0) {
            tail = head;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if (size++ == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (index > 0) {
            prev = prev.next;
            index--;
        }
        prev.next = new ListNode(val, prev.next);
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        if (index == 0) head = prev.next;
        // 使用size的好处，可以判断是不是最后一个
        if (index == size - 1) tail = prev;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */