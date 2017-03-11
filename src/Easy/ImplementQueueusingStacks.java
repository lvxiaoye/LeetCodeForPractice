package Easy;

import java.util.Stack;

public class ImplementQueueusingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue mq = new MyQueue();
		mq.push(3);
		mq.push(4);
		int param_2 = mq.pop();
		System.out.println(param_2);
		int param_3 = mq.peek();
		System.out.println(param_3);
		mq.pop();
		boolean param_4 = mq.empty();
		System.out.print(param_4);
	}
	public static class MyQueue {
		Stack<Object> stack;
	
	    /** Initialize your data structure here. */
	    public MyQueue() {
	        stack = new Stack<Object>();
	       
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        stack.add(x);
	      
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	int x= peek();
	    	stack.remove(0);
	        return x;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	int length = stack.size();
	    	if(length ==0){
	    		try {
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	return (int)stack.get(0);
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(stack.isEmpty()){
	        	return true;
	        }
	        return false;
	    }
	    /**
	     * class MyQueue {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int x) {
        input.push(x);
    }

    public void pop() {
        peek();
        output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}
	     */
	    /**
	     * class MyQueue {
Stack<Integer> queue = new Stack<Integer>();
// Push element x to the back of queue.
public void push(int x) {
    Stack<Integer> temp = new Stack<Integer>();
    while(!queue.empty()){
        temp.push(queue.pop());
    }
    queue.push(x);
    while(!temp.empty()){
        queue.push(temp.pop());
    }
}

// Removes the element from in front of queue.
public void pop() {
    queue.pop();
}

// Get the front element.
public int peek() {
    return queue.peek();
}

// Return whether the queue is empty.
public boolean empty() {
    return queue.empty();
}
	     */
	}

	/**
	 * Your MyQueue object will be instantiated and called as such:
	 * MyQueue obj = new MyQueue();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.peek();
	 * boolean param_4 = obj.empty();
	 */

}
