/**
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
package Easy;


public class MinimumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(10);
		t.left = new TreeNode(5);
		t.right = new TreeNode(-3);
		t.left.left = new TreeNode(3);
		t.left.right = new TreeNode(2);
		t.left.left.left = new TreeNode(3);
		t.left.left.right = new TreeNode(-2);
		t.left.right.left = null;
		t.left.right.right = new TreeNode(1);
		t.right.left = null;
		t.right.right = new TreeNode(-3);
		t.right.right.right = new TreeNode(11);
		System.out.println(minDepth(t));
		
	}
/*    public static int minDepth(TreeNode root) {
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
        leftDepth +=  minDepth(root.left);
        rightDepth += minDepth(root.right);
        return (leftDepth<rightDepth?leftDepth:rightDepth);
        
    
    }*/
	//unglaublich.........warum kann ich das nicht machen~~~~(>_<)~~~~
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
       
    }

    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val = x;
    	}
    }

}
