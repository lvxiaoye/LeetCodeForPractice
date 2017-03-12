/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
package Easy;

import java.util.ArrayList;
import java.util.List;

import Easy.BinaryTreePaths.TreeNode;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TreeNode t = new TreeNode(5);
		t.left = new TreeNode(4);
		t.right = new TreeNode(8);
		t.left.left=new TreeNode(11);
		t.left.left.right = new TreeNode(2);
		t.left.left.left = new TreeNode(7);
		t.right.left = new TreeNode(13);
		t.right.right = new TreeNode(4);
		t.right.right.right=new TreeNode(1);
		System.out.println(hasPathSum(t, 20));
	}

    public static boolean hasPathSum(TreeNode root, int sum) {
        List<Integer> l = new ArrayList<Integer>();
        if(root == null){
        	return false;
        }
        path(root,0,l);
        
        for(int i:l){
        	System.out.print(i+" ");
        	if(i==sum){
        		return true;
        	}
        }
        System.out.println("\n");
        return false;
 
    }
    public static void path(TreeNode root, Integer sum,List<Integer> l){

    	if(root.left ==null & root.right == null){
    		l.add(sum+root.val);
    	}
    	if(root.left!= null){
    		path(root.left,sum+root.val,l);
    		
    	}
    	if(root.right!=null){
    		path(root.right,sum+root.val,l);
    	}
    }
       
    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val = x;
    	}
    }
    /*
     * public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
    
        if(root.left == null && root.right == null && sum - root.val == 0) return true;
    
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
     */
}
