/**
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
Note: There are at least two nodes in this BST.
 */
package Easy;

import java.util.TreeSet;


public class MinumumAbsoluteDifferenceInBST {
    TreeSet<Integer> set = new TreeSet<>();
    int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tr = new TreeNode(4);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(7);
		tr.left.left = new TreeNode(0);
		tr.left.right = new TreeNode(100);
		tr.right.left = new TreeNode(200);
		tr.right.right = new TreeNode(9);
		MinumumAbsoluteDifferenceInBST m = new MinumumAbsoluteDifferenceInBST();
		System.out.println(m.getMinimumDifference(tr));
	}
/*
 * Solution 2 - Pre-Order traverse, time complexity O(NlgN), space complexity O(N).
 */
   public int getMinimumDifference(TreeNode root) {
            if (root == null) return min;
            
            if (!set.isEmpty()) {
                if (set.floor(root.val) != null) {
                    min = Math.min(min, Math.abs(root.val - set.floor(root.val)));
                }
                if (set.ceiling(root.val) != null) {
                    min = Math.min(min, Math.abs(root.val - set.ceiling(root.val)));
                }
            }
            
            set.add(root.val);
            
            getMinimumDifference(root.left);
            getMinimumDifference(root.right);
            
            return min;
    }

   /*
    * method2:The most common idea is to first inOrder
    *  traverse the tree and compare the delta between each of 
    *  the adjacent values. It's guaranteed to have the correct answer 
    *  because it is a BST thus inOrder traversal values are sorted.
    *   In-Order traverse, time complexity O(N), space complexity O(1).
    * public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
    
}
    */

    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int i){val = i;}
    }
}
