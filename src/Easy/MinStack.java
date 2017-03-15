/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMinStack minStack = new MyMinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		int param_4=minStack.getMin();   
		System.out.println(param_4);
		minStack.pop();
		int param_3=minStack.top();      
		System.out.println(param_3);
		System.out.println(minStack.getMin());   

	}
/*	time limit exceed
 * public static class MyMinStack {
		List<Object> l;
	    *//** initialize your data structure here. *//*
	    public MyMinStack() {
	        l=new ArrayList<Object>();
	    }
	    
	    public void push(int x) {
	        l.add(l.size(), x);
	    }
	    
	    public void pop() {
	        l.remove(l.size()-1);
	    }
	    
	    public int top() {
	        return (int) l.get(l.size()-1);
	    }
	    
	    public int getMin() {
	    	int min=Integer.MAX_VALUE;
	        for(int i=0;i<l.size();i++){
	        	min = Math.min(min, (int) l.get(i));
	        }
	        return min;
	    }
	}*/
	 public static class MyMinStack {
		 Stack<Integer> stack=new Stack<>();
		 int min=Integer.MAX_VALUE;
		 public void push(int x) {
			 if(x<=min) {
				 stack.push(min); 
				 min=x;
			 }
			 stack.push(x);
		 }
		 public void pop() {
			 if(stack.peek()==min){ 
				 stack.pop();
				 min=stack.pop();
			 }
			 else stack.pop();
		 }
		 public int top() {
			 return stack.peek();
		 }
		 public int getMin() {
			 return min;
		 }
	 }

	/*
	 * public class MinStack {
    long min;
    Stack<Long> stack;

    public MinStack(){
        stack=new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(0L);
            min=x;
        }else{
            stack.push(x-min);//Could be negative if min value needs to change
            if (x<min) min=x;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        
        long pop=stack.pop();
        
        if (pop<0)  min=min-pop;//If negative, increase the min value
        
    }

    public int top() {
        long top=stack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}
/**
 * class MinStack {
    private Node head;
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
 */

	  
	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
}
