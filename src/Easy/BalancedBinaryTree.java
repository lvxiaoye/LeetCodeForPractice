/**
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary 
tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
package Easy;


public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(3);
		t.left = new TreeNode(9);
		t.right = new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);
		t.right.left.left = new TreeNode(1);
		t.right.left.right = new TreeNode(2);
		System.out.println(isBalanced(t));
		//System.out.println(subTreeDepth(t.right));
		//System.out.println(subTreeDepth(t.left));
		TreeNode tr = new TreeNode(4);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(7);
		tr.left.left = new TreeNode(1);
		tr.left.right = new TreeNode(3);
		tr.right.left = new TreeNode(6);
		tr.right.right = new TreeNode(9);
		System.out.println(isBalanced(tr));
		//System.out.println(subTreeDepth(tr));
		TreeNode s = new TreeNode(1);
		s.left = new TreeNode(2);
		s.right = new TreeNode(2);
		s.left.left = new TreeNode(3);
		s.left.left.left = new TreeNode(4);
		s.right.right = new TreeNode(3);
		s.right.right.right = new TreeNode(4);
		System.out.println(isBalanced(s));
	}
    public static boolean isBalanced(TreeNode root) {
    	if(root == null){
    		return true;
    	}
    	if(root.left != null || root.right !=null){
    		if(Math.abs(subTreeDepth(root.left)-subTreeDepth(root.right)) >1){
    			return false;
    		}else
    			return (isBalanced(root.left) & isBalanced(root.right));
    	}
        return true;
    }
    public static int subTreeDepth(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	if(root.left==null & root.right == null){
    		return 1;
    	}
    	return Math.max(subTreeDepth(root.left), subTreeDepth(root.right))+1;
    	
    	
    }
    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val = x;
    	}
    }
    /**Java solution based on height, check left and right node in every recursion to avoid further useless search
     * public boolean isBalanced(TreeNode root) {
    if(root==null){
        return true;
    }
    return height(root)!=-1;
    
}
public int height(TreeNode node){
    if(node==null){
        return 0;
    }
    int lH=height(node.left);
    if(lH==-1){
        return -1;
    }
    int rH=height(node.right);
    if(rH==-1){
        return -1;
    }
    if(lH-rH<-1 || lH-rH>1){
        return -1;
    }
    return Math.max(lH,rH)+1;
}
     */

}
