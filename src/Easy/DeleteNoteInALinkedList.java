/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
package Easy;


public class DeleteNoteInALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ln = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ln.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = null;

/*		while(ln!= null){
			System.out.print(ln.val + " ");
			ln = ln.next;
		}*/
		
		deleteNode(ln);
	
		while(ln!= null){
			System.out.print(ln.val + " ");
			ln = ln.next;
		}
	}
    public static void deleteNode(ListNode node) {
    	if(node == null){
    		return;
    	}
/*    	if(node.next !=null){
    		node = new ListNode(node.next.val);
    		return;
    	}*/
    	else{
    			node.val = node.next.val;
    			node.next = node.next.next;
    	}
    		
        
    }

    
    public static class ListNode{
    	int val;
    	ListNode next;
    	public ListNode(int x){
    		val = x;
    	}
    }

}
