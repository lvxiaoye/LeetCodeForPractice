/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
package Easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("([])"));

	}
    public static boolean isValid(String s) {
    	Stack<Integer> stack = new Stack<Integer>();
    	for(char c:s.toCharArray()){
    		if(c=='('){
    			stack.push(0);
    		}else if(c ==')'){
    			
    			if(stack.empty() || stack.peek()!=0){
    				return false;
    			}
    			stack.pop();
    		}else if(c == '{'){
    			stack.push(1);
    		}else if(c=='}'){
       			if(stack.empty() || stack.peek()!=1){
    				return false;
    			}
    			stack.pop();
    		}else if(c=='['){
    			stack.push(2);
    		}else if(c==']'){
       			if(stack.empty()||stack.peek()!=2){
    				return false;
    			}
    			stack.pop();
    		}
    	}
    	
   			if(!stack.isEmpty()){
   				return false;
   			}
   		
    	return true;
    	
        
    }

    /* runtime O(1).....amazing.....
     ** public boolean isValid(String s) {
		char[] stack = new char[s.length()];
		int head = 0;
		for(char c : s.toCharArray()) {
			switch(c) {
				case '{':
				case '[':
				case '(':
					stack[head++] = c;
					break;
				case '}':
					if(head == 0 || stack[--head] != '{') return false;
					break;
				case ')':
					if(head == 0 || stack[--head] != '(') return false;
					break;
				case ']':
					if(head == 0 || stack[--head] != '[') return false;
					break;
			}
		}
		return head == 0;

	}
     */
}
