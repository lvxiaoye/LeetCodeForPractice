/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */
package Easy;



public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(3);
		TreeNode g = new TreeNode(2);
		TreeNode n = new TreeNode(1);
		n.left = new TreeNode(2);
		n.right = new TreeNode(2);
		n.left.right = new TreeNode(3);
		n.right.right = new TreeNode(3);
		a.left =b;
		a.right = g;
		b.left =c;
		b.right = d;
		g.left = e;
		g.right = f;
		System.out.println(isSymmetric(a));
		System.out.println(isSymmetric(n));
	}
    public static boolean isSymmetric(TreeNode root) {
             
    	return root == null || helper(root.left,root.right);
    }
    private static boolean helper(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
    	if(left == null || right == null){
    		return left == right;
    	}
    	if(left.val != right.val){
    		return false;
    	}
		return helper(left.right,right.left) && helper(left.left,right.right);
	}
    /**循环
     * public boolean isSymmetric(TreeNode root) {
    if(root==null)  return true;
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode left, right;
    if(root.left!=null){
        if(root.right==null) return false;
        stack.push(root.left);
        stack.push(root.right);
    }
    else if(root.right!=null){
        return false;
    }
        
    while(!stack.empty()){
        if(stack.size()%2!=0)   return false;
        right = stack.pop();
        left = stack.pop();
        if(right.val!=left.val) return false;
        
        if(left.left!=null){
            if(right.right==null)   return false;
            stack.push(left.left);
            stack.push(right.right);
        }
        else if(right.right!=null){
            return false;
        }
            
        if(left.right!=null){
            if(right.left==null)   return false;
            stack.push(left.right);
            stack.push(right.left);
        }
        else if(right.left!=null){
            return false;
        }
    }
    
    return true;
}*/
	public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val = x;
    	}
    }

}
