package udemy;

import java.util.LinkedList;
import java.util.Queue;

public class L225_ImplementAStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyStack {
	
	Queue<Integer> q = new LinkedList<> ();

    /** Initialize your data structure here. */
    public MyStack() {
    	
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q.add(x);
    	
    	int n = q.size();
    	while (n-- > 1) {
    		q.add(q.poll());
    		// retrieve the head of the queue
    	}
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	return q.poll();
         
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
