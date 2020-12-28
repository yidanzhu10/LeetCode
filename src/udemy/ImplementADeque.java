package udemy;

import java.util.Stack;

public class ImplementADeque {

}

class MyDeque{
    Stack<Integer> s;

    public MyDeque() {
        s = new Stack<> ();

    }

    public boolean empty() {
        return s.isEmpty();
    }

    public void addRear(int x) {
        s.push(x);
    }

    public void addFront(int x) {
        s.insertElementAt(x, 0);
    }

    public void removeFromRear() {
        s.pop();
    }

    public void removeFromFront() {
        s.removeElementAt(0);
    }

    public int size() {
        return s.size();
    }

}

