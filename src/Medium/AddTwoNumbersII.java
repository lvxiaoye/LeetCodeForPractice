/**
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
 */
package Medium;

import java.util.Stack;

public class AddTwoNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1= new ListNode(7);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(4);
		l1.next.next.next=new ListNode(3);
		ListNode l2= new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode res = addTwoNumbers(l1, l2);
		System.out.println(res.val);
	}

    public static class ListNode {
    	int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
    }
     
    /*
     *     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = getLength(l1);
        int size2 = getLength(l2);
        ListNode head = new ListNode(1);
        // Make sure l1.length >= l2.length
        head.next = size1 < size2 ? helper(l2, l1, size2 - size1) : helper(l1, l2, size1 - size2);
        // Handle the first digit
        if (head.next.val > 9) {
            head.next.val = head.next.val % 10;
            return head;
        }
        return head.next;
    }
    // get length of the list
    public int getLength(ListNode l) {
        int count = 0;
        while(l != null) {
            l = l.next;
            count++;
        }
        return count;
    }
    // offset is the difference of length between l1 and l2
    public ListNode helper(ListNode l1, ListNode l2, int offset) {
        if (l1 == null) return null;
        // check whether l1 becomes the same length as l2
        ListNode result = offset == 0 ? new ListNode(l1.val + l2.val) : new ListNode(l1.val);
        ListNode post = offset == 0 ? helper(l1.next, l2.next, 0) : helper(l1.next, l2, offset - 1);
        // handle carry 
        if (post != null && post.val > 9) {
            result.val += 1;
            post.val = post.val % 10;
        }
        // combine nodes
        result.next = post;
        return result;
    }
     */
    /*
     *     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        HashMap<Integer, Integer> hm1 = new HashMap<>(); //Store the 'index' and the value of List1
        HashMap<Integer, Integer> hm2 = new HashMap<>(); //Store the 'index' and the value of List2
        int i = 1, j = 1;
        
        while(l1 != null){
            hm1.put(i, l1.val);
            l1 = l1.next;
            i++;
        }
        while(l2 != null){
            hm2.put(j, l2.val);
            l2 = l2.next;
            j++;
        }
        
        int carry = 0;
        i--; j--;
        ListNode head = null;
        
      //Create new nodes to the front of a new LinkedList
        while(i > 0 || j > 0 || carry > 0){

            int a = i > 0 ? hm1.get(i) : 0;
            int b = j > 0 ? hm2.get(j) : 0;
            int res = (a + b + carry) % 10;
            
            ListNode newNode = new ListNode(res);
            newNode.next = head;
            head = newNode;
            
            carry = (a + b + carry) / 10;
            i--; j--;
        }
        return head;
    }

     */
    

}
