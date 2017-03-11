/**
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

package Easy;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tr = new TreeNode(3);	
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(1);
		tr.left.left = new TreeNode(4);
		System.out.println(maxDepth(tr));
	}

    public static int maxDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}else if(root.left == null & root.right == null){
    		return 1;
    	}
    	int leftDepth =0;
    	int rightDepth =0;
        if(root.left != null) {
        	leftDepth ++;
        }
        if(root.right!= null){
        	rightDepth++;
        }
        leftDepth +=  maxDepth(root.left);
        rightDepth += maxDepth(root.right);
        return (leftDepth>rightDepth?leftDepth:rightDepth);
        
    }
    /*
     * public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
     */

   
    public static class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     
   }
}
