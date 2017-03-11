/**
 * Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?

Subscribe to see which companies asked this question
 */
package Easy;

import Easy.DeleteNoteInALinkedList.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(7);
		ListNode d = new ListNode(8);
		a.next = b;
		b.next = c;
		c.next = d;
		ListNode x = reverseList(a);
		while(x.next !=null){
			System.out.print(x.val + " ");
			x= x.next;
		}
		System.out.print(x.val);

	}

    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head!=null){
        	ListNode next = head.next;
        	head.next = newHead;
        	newHead = head;
        	head=next;
        }
        return newHead;
    }



	public static class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int i){
    		val = i;
    	}
    	
    }
/*	递归法
 * public ListNode reverseList(ListNode head) {
	    // recursive solution 
	    return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
	    if (head == null)
	        return newHead;
	    ListNode next = head.next;
	    head.next = newHead;
	    return reverseListInt(next, head);
	}*/
}
