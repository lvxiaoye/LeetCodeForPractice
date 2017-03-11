/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
package Easy;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		l.next = new ListNode(1);
		l.next.next = new ListNode(2);
		l.next.next.next = new ListNode(3);
		l.next.next.next.next = new ListNode(3);
	
		ListNode r = new ListNode(1);
		r.next = new ListNode(1);
		r.next.next = new ListNode(1);
		ListNode result = deleteDuplicates(l);
		while(result!=null){
			System.out.print(result.val + " ");
			result = result.next;
		}

	}
    public static ListNode deleteDuplicates(ListNode head) {
       if(head == null){
    	   return null;
       }
       if(head.next == null){
    	   return head;
       }
       if(head.next!=null){
    	   if(head.next.val == head.val){
    		   deleteDuplicates(head.next);
    		   head.next = head.next.next;   		   
    	   }else
    		   deleteDuplicates(head.next);
    		   
       }
       return head;
    }
    public static class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int x){
    		val =x;
    	}
    }
    /**
     * public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}
     */

}
