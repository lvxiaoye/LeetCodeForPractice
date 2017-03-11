/**
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
package Easy;

import java.util.HashSet;
import java.util.Set;


public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		l.next = new ListNode(3);
		l.next.next = new ListNode(5);
		l.next.next.next = l;
		ListNode t = new ListNode(1);
		t.next = new ListNode(3);
		t.next.next = new ListNode(5);
		t.next.next.next = new ListNode(7);
		System.out.println(hasCycle(l));
		System.out.println(hasCycle(t));
		
	}
    public static boolean hasCycle(ListNode head) {
    	Set<ListNode> set = new HashSet<ListNode>();
    	set.add(head);
    	if(head == null){
    		return false;
    	}
    	while(head.next!=null){
    		if(set.contains(head.next)){
    			return true;
    		}
    		else {
    			set.add(head.next);
    			head = head.next;
    		}
    	}
    	return false;
        
    }
    /**
     * public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}
Use two pointers, walker and runner.
walker moves step by step. runner moves two steps at time.
if the Linked List has a cycle walker and runner will meet at some
point.
     *
     */
    public static class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int x){
    		val = x;
    	}
    }

}
