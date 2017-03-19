/**
 * You need to find the largest value in each row of a binary tree.

Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
 */
package Medium;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(1);
		t.left=new TreeNode(3);
		t.right=new TreeNode(2);
		t.left.left=new TreeNode(5);
		t.left.right=new TreeNode(3);
		t.right.right=new TreeNode(9);
		List<Integer> res = largestValues(t);
		for(int i:res){
			System.out.println(i+" ");
		}
	}
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
    	if(root==null){
        	return res;
        }

        helper(root,res,0);
        return res;
    }
    public static void helper(TreeNode root, List<Integer> res, int d){
    	if(root==null){
    		return ;
    	}
    	if(d==res.size()){
    		res.add(root.val);
    	}else{
    		res.set(d, Math.max(res.get(d), root.val));
    	}
    	helper(root.left,res,d+1);
    	helper(root.right,res,d+1);
    }
    /**
     * 
     *  public int[] findValueMostElement(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return new int[0];
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(max);
        }
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        
        return result;
    }
     *
     */
    /*
     * 
     */
    public static class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
    	 TreeNode(int x) { val = x; }
    }

}
