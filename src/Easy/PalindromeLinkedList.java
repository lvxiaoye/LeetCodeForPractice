/**
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
package Easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		l.next = new ListNode(0);
		l.next.next = new ListNode(1);
		ListNode t = new ListNode(1);
		t.next = new ListNode(1);
		t.next.next = new ListNode(2);
		t.next.next.next=new ListNode(1);
		System.out.println(isPalindrome(l));
		System.out.println(isPalindrome(t));
	}

    public static boolean isPalindrome(ListNode head) {
    	List<Integer> pre = new ArrayList<>();
    	ListNode result = reverse(head,pre);

    	for(int i=0;i<pre.size();i++){		
    		if(result.val!=pre.get(i)){
    			return false;
    		}
    		result = result.next;
    	}
    	return true;
        
    }
    private static ListNode reverse(ListNode head,List<Integer>pre) {
		// TODO Auto-generated method stub
    	ListNode newHead = null;
    	while(head!=null){
    		pre.add(head.val);
    		ListNode next = head.next;
    		head.next = newHead;
    		newHead = head;
    		head=next;
    	}
		return newHead;
	}
    /**
     * This can be solved by reversing the 2nd half and compare the two halves. Let's start with an example [1, 1, 2, 1].

In the beginning, set two pointers fast and slow starting at the head.

1 -> 1 -> 2 -> 1 -> null 
sf
(1) Move: fast pointer goes to the end, and slow goes to the middle.

1 -> 1 -> 2 -> 1 -> null 
          s          f
(2) Reverse: the right half is reversed, and slow pointer becomes the 2nd head.

1 -> 1    null <- 2 <- 1           
h                      s
(3) Compare: run the two pointers head and slow together and compare.

1 -> 1    null <- 2 <- 1             
     h            s
public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}

     */
	public static class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int x){
    		val = x;
    	}
    }
}
