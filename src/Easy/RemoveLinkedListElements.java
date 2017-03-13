/**
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
package Easy;


public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		l.next=new ListNode(2);
		l.next.next=new ListNode(6);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next=new ListNode(5);
		l.next.next.next.next.next.next=new ListNode(6);
		ListNode result = removeElements(l, 6);
		while(result!=null){
			System.out.print(result.val+" ");
			result=result.next;
		}
	}
	public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
	/*
	 *    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
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
