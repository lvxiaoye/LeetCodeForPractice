/**
 * Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
package Easy;

public class SumOfLeftLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TreeNode tr = new TreeNode(3);
        tr.left = new TreeNode(9);
        tr.right = new TreeNode(20);
        tr.right.left = new TreeNode(15);
        tr.right.right = new TreeNode(7);
       
        System.out.println(sumOfLeftLeaves(tr));
	}
    public static int sumOfLeftLeaves(TreeNode root) {
 
    	if(root == null){
    		return 0;
    	}
       	int sum =0;
    	if(root.left != null){
    		if(root.left.left == null & root.left.right == null){
    			sum+=root.left.val;
    		}else
    			sum+=sumOfLeftLeaves(root.left);
    	}
    	sum += sumOfLeftLeaves(root.right);
    	
    	return sum;
        
    }
    
    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val=x;
    	}
    }
    


}
