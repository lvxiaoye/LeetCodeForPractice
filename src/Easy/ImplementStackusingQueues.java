/**
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MyStack obj = new MyStack();
		 obj.push(3);
		 obj.push(4);
		 int param_2 = obj.pop();
		 System.out.println(param_2);
		 int param_3 = obj.top();
		 System.out.println(param_3);
		 boolean param_4 = obj.empty();
		 System.out.println(param_4);
	}

	public static class MyStack {
		Queue<Object> input;
		Queue<Object> output;
	    /** Initialize your data structure here. */
	    public MyStack() {
	        input = new LinkedList<>();
	        //output = new LinkedList<>();
	      }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        input.add(x);
	        for(int i=1;i<input.size();i++){
	        	input.add(input.poll());
	        }
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        return (int) input.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return (int) input.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return input.isEmpty();
	    }
	}
	/**
	 * class MyStack {
//using two queue. The push is inefficient.
private Queue<Integer> q1 = new LinkedList<Integer>();
private Queue<Integer> q2 = new LinkedList<Integer>();
public void push(int x) {
    if(q1.isEmpty()) {
        q1.add(x);
        for(int i = 0; i < q2.size(); i ++)
            q1.add(q2.poll());
    }else {
        q2.add(x);
        for(int i = 0; i < q1.size(); i++)
            q2.add(q1.poll());
    }
}

public void pop() {
    if(!q1.isEmpty()) 
        q1.poll();
    else
        q2.poll();
}
public int top() {
    return q1.isEmpty() ? q2.peek() : q1.peek();
}
public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
}
}
2 pop() and top() are inefficient

When you push elements, choose a queue which is not empty(whichever when both are empty).
When you do pop() or top(), first pop all elements of the queue except the tail into another empty queue, and then pop the tail which is your want.

For example:

push(1):

[ , , 1] [ , , ]

push(2):

[ ,2,1] [ , , ]

top();

[ , , 2] [ , ,1] -> [ , , ] [ ,2,1]

pop():

[ , , 1] [ , ,2] -> [ , ,1] [ , , ]

push(3) :

[ ,3,1] [ , , ]

class MyStack{
//using two queue. The pop and top are inefficient.
private Queue<Integer> q1 = new LinkedList<Integer>();
private Queue<Integer> q2 = new LinkedList<Integer>();
public void push(int x) {
    if(!q1.isEmpty()) 
        q1.add(x);
    else
        q2.add(x);
}
public void pop() {
    if(q1.isEmpty()) {
        int size = q2.size();
        for(int i = 1; i < size; i ++) {
            q1.add(q2.poll());
        }
        q2.poll();
    }else {
        int size = q1.size();
        for(int i = 1; i < size; i ++) {
            q2.add(q1.poll());
        }
        q1.poll();
    }
}
public int top() {
    int res;
    if(q1.isEmpty()) {
        int size = q2.size();
        for(int i = 1; i < size; i ++) {
            q1.add(q2.poll());
        }
        res = q2.poll();
        q1.add(res);
    }else {
        int size = q1.size();
        for(int i = 1; i < size; i ++) {
            q2.add(q1.poll());
        }
        res = q1.poll();
        q2.add(res);
    }
    return res;
}
public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
}
}
	 */
}
