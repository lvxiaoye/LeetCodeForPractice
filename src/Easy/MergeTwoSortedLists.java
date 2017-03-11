/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
package Easy;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(5);
		l1.next.next=new ListNode(9);
		l1.next.next.next=new ListNode(10);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(4);
		l2.next.next.next=new ListNode(8);
		ListNode result = mergeTwoLists(l1, l2);
		while(result!=null){
			System.out.print(result.val + "->");
			result = result.next;
		}
	}
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null & l2==null){
        	return null;
        }else if(l1 == null){
        	return l2;
        }else if(l2 == null){
        	return l1;
        }else{
        	ListNode result = null;
        	if(l1.val >= l2.val){
        		result = new ListNode(l2.val);
        		l2 = l2.next;
        	}else{
        		result = new ListNode(l1.val);
        		l1 = l1.next;
        	}
        	ListNode head = result;
        	while(l1!=null & l2!=null){
        		if(l1.val >= l2.val){
        			result.next = l2;
        			l2=l2.next;
        		}else{
        			result.next= l1;
        			l1 = l1.next;
        		}
        		result = result.next;
        	}
    		while(l2 != null){
    			result.next = l2;
    			l2 =l2.next;
    			result = result.next;
    		}
    		while(l1 != null){
    			result.next = l1;
    			l1 = l1.next;
    			result = result.next;
    		}

        	return head;
        }
        
    }
    public static class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int x){
    		val = x;
    	}
    }

    /**迭代
     * public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
     */
}
