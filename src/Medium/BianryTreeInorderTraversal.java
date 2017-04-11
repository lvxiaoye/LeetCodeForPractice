/**
 * Given a binary tree, return the inorder traversal of its nodes' values. 中序遍历

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].
 */
package Medium;

import java.util.ArrayList;
import java.util.List;

public class BianryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t=new TreeNode(1);
		t.right = new TreeNode(2);
		t.right.left = new TreeNode(3);
		List<Integer> res = inorderTraversal(t);
		for(int i:res){
			System.out.print(i+" ");
		}
		
	}
    public static List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }
    

    private static void inorder(TreeNode root, List<Integer> res) {
		// TODO Auto-generated method stub
    	if(root == null){
        	return ;
        }
		inorder(root.left,res);
		res.add(root.val);
		inorder(root.right,res);
	}


	public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x){
    		val = x;
    	}
    }
}
	

