/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed
 * to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
 */
package Medium;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class ConvertBSTtoGreaterTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(5);
		t.left=new TreeNode(2);
		t.right=new TreeNode(13);
		TreeNode res = convertBST(t);
		System.out.println(res.val);
		System.out.println(res.left.val+" "+res.right.val);
	}

   /* time limit exceed
   *  public static TreeNode convertBST(TreeNode root) {
        if(root==null){
        	return null;
        }
        TreeSet<Integer> map = new TreeSet<Integer>();
        convert(root,map);
        Iterator<Integer> iter = map.iterator();
        while(iter.hasNext()){
        	System.out.println(iter.n);
        }
        con(root,map);
       
        return root;
    }
    
    public static void convert(TreeNode root, TreeSet<Integer> map){
    	if(root == null){
    		return;
    	}
    	if(root!=null){
    		map.add(root.val);
    	}
    	convert(root.left,map);
    	convert(root.right,map);  	
    }
    
    public static void con(TreeNode root, TreeSet<Integer> map){
    	if(root == null){
    		return;
    	}
    	Iterator<Integer> iter = map.descendingIterator();
        int sum=0;
        
    	while(iter.hasNext()){
    		int k = iter.next();
    		if(root.val<k){
         	sum+=k;
    		}
        }
        root.val+=sum;
        con(root.left,map);
        con(root.right,map);
    }*/
	
	//notice, it's a BST, binary research Tree...................
	
	static int sum = 0;
	    
	    public static TreeNode convertBST(TreeNode root) {
	        convert(root);
	        return root;
	    }
	    
	    public static void convert(TreeNode cur) {
	        if (cur == null) return;
	        convert(cur.right);
	        cur.val += sum;
	        sum = cur.val;
	        convert(cur.left);
	    }
    
    public static class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
