/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	Example:
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 */
package Medium;
/*
 * ~~~~(>_<)~~~~    
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input the length of List: ");
		//int length = sc.nextInt();
		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l1 = solution.new ListNode(2);
		l1.next = solution.new ListNode(4);
		l1.next.next = solution.new ListNode(3);
		ListNode l2 =solution.new ListNode(5);
		l2.next =solution.new ListNode(6);
		l2.next.next = solution.new ListNode(4);
		//System.out.println("Please input the first list: ");
		/*for(int i = 0;i<length;i++){
			int[] temp = new int[length];
			l1 = solution.new ListNode(sc.nextInt());
			//l1=l1.next;
		}*/
/*		System.out.println("The fist list are: "+l1.val);
		while(l1.!= null){
			System.out.print("->" + l1.next.val + "\n");
		}*/
/*		System.out.println("Please input the second list: ");
		for(int i = 0;i<length;i++){
			l2= solution.new ListNode(sc.nextInt());
			l2=l2.next;
		}*/
		ListNode result= solution.addTwoNumbers(l1, l2);
/*		System.out.print(result.val);
		while(result.next!=null){
			System.out.print("->" + result.next.val+"\n");
		}*/
		
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode result = new ListNode(0);
			ListNode head = result;
			int i=0;
			while((l1 != null) ||(l2 !=null)) {
				int k =(l1 == null)? 0:l1.val;
				int q=(l2==null)?0:l2.val;
				result.next = new ListNode((k + q+i) %10);
				i = (k+q+i)/10;
			    result = result.next;
				l1=(l1==null)?l1:l1.next;
				l2=(l2==null)?l2:l2.next;
			}
			if(i>0){
			    result.next = new ListNode(i);
			}
			return head.next;
			
	}
  
    
    //Definition for singly-linked list
    public class ListNode{
    	int val;
    	ListNode next;
    	ListNode(int x){val =x;}
    	
    }
}
