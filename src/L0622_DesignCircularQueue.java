public class L0622_DesignCircularQueue {
}
class MyCircularQueue {

    private int[] data;
    private int head;
    private int tail;
    private int size;

    // set the size of the queue to be k
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful **/
    public boolean enQueue(int value) {
        if(isFull() == true){
            return false;
        }
        if(isEmpty() == true){
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. **/
    public boolean deQueue() {
        if(isEmpty() == true) {
            return false;
        }
        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue **/
    public int Front() {
        if(isEmpty() == true){
            return -1;
        }
        return data[head];
    }

    /** Get the last item from the queue **/
    public int Rear() {
        if(isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}