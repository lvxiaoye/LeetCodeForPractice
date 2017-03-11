/**
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.package Easy;
 * 
 *
 */
package Easy;

import Easy.InvertBinaryTree.TreeNode;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tr = new TreeNode(4);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(7);
		tr.left.left = new TreeNode(1);
		tr.left.right = new TreeNode(3);
		tr.right.left = new TreeNode(6);
		tr.right.right = new TreeNode(9);
		
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(2);
		t.right = new TreeNode(7);
		t.left.left = new TreeNode(1);
		t.left.right = new TreeNode(3);
		t.right.left = new TreeNode(6);
		t.right.right = new TreeNode(9);
		
		TreeNode q = new TreeNode(4);
		q.left = new TreeNode(2);
		q.right = new TreeNode(1);
		q.left.left = new TreeNode(4);
		TreeNode n = null;
		TreeNode p = null;
		System.out.println(isSameTree(tr, t));
		System.out.println(isSameTree(n, p));
		
	}
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p == null & q == null){
    		return true;
    	}
    	if((p == null & q != null) ||(p != null & q == null)){
    		return false;
    	}
    	System.out.println(ASameNode(p, q));
    	String s = ASameNode(p,q);
    	char[] result = s.toCharArray();

    	for(char c:result){
    		if(c != '0'){
    			return false;
    		}
    	}
        return true;
    }
    
    public static String ASameNode(TreeNode p, TreeNode q) {
    	String s ="";
    	if(p == null & q == null){
    		return s+0;
    	}
    	

    	if(p.val == q.val){
    		s+=0;
    	}else{
    		s+= 1;
    	}
    	if((p.left != null & q.left ==null) || (p.left == null & q.left != null)|| (p.right != null & q.right == null) || (p.right == null & q.right != null)){
    		s+= 1;
    	}
    	if(p.left != null & q.left != null)
    		s+= ASameNode(p.left, q.left);
    	if(p.right != null & q.right != null)
    		s+= ASameNode(p.right, q.right);
    	return s;
        
    }
    
    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int i){
    		val = i;
    	}
    }
    
    /*
     * public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
}
     */

}
