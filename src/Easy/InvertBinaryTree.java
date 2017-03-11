/**
 *   4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */

package Easy;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tr = new TreeNode(4);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(7);
		tr.left.left = new TreeNode(1);
		tr.left.right = new TreeNode(3);
		tr.right.left = new TreeNode(6);
		tr.right.right = new TreeNode(9);
		
		TreeNode result = invertTree(tr);
		System.out.println(result.toString());
		
	}
	
   
	
	public static TreeNode invertTree(TreeNode root) {
		if(root==null){
			return null;
		}else if(root.left == null & root.right == null){
			return root;
		}else{
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			invertTree(root.left);
			invertTree(root.right);
			return root;
		}
			
    
    
    }
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x){val = x;}
		public String toString(){
			if(left ==null & right ==null){
				return val+" ";
			}else
				return  val+"\n"+ left.toString() + right.toString();
		}
	}
}
	 
   
