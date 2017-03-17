/**
 * Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
Example 2: 
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7
Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindBottomLeftTreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t=new TreeNode(1);
		t.left=new TreeNode(2);
		t.right=new TreeNode(3);
		t.left.left = new TreeNode(4);
		t.right.left=new TreeNode(5);
		t.right.right=new TreeNode(6);
		t.right.left.left=new TreeNode(7);
		TreeNode r = new TreeNode(0);
		System.out.println(findBottomLeftValue(r));
	}
/*    public static int findBottomLeftValue(TreeNode root) {
    	return findBottomLeftValue(root, 1, new int[]{0,0});
  
    	       
    }
    public static int findBottomLeftValue(TreeNode root, int depth, int[] res) {
    	if (res[1]<depth) {res[0]=root.val;res[1]=depth;}
        if (root.left!=null) findBottomLeftValue(root.left, depth+1, res);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1, res);
        return res[0];
 }*/
	/*public class Solution {
	    int ans=0, h=0;
	    public int findBottomLeftValue(TreeNode root) {
	        findBottomLeftValue(root, 1);
	        return ans;
	    }
	    public void findBottomLeftValue(TreeNode root, int depth) {
	        if (h<depth) {ans=root.val;h=depth;}
	        if (root.left!=null) findBottomLeftValue(root.left, depth+1);
	        if (root.right!=null) findBottomLeftValue(root.right, depth+1);
	    }
	}*/

    public static int findBottomLeftValue(TreeNode root) {
    	TreeMap<Integer,Integer> map=new TreeMap<>();
    	depth(root,1,map);
    	return map.lastEntry().getValue();
    }
    public static void depth(TreeNode root,int depth,TreeMap<Integer,Integer>map){
    	if(root==null){
    		return;
    	}
    	map.put(depth,root.val);
    	System.out.println(depth+" "+root.val);
    	if(root.right!=null)  depth(root.right,depth+1,map);
    	if(root.left!=null) depth(root.left,depth+1,map);

    	
    }
    /*
     * public int findLeftMostNode(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        root = queue.poll();
        if (root.right != null)
            queue.add(root.right);
        if (root.left != null)
            queue.add(root.left);
    }
    return root.val;
}
     */
    
	
	public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x){
    		val = x;
    	}
    }

}
