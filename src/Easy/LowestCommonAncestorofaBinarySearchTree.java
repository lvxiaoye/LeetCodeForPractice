/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class LowestCommonAncestorofaBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode t = new TreeNode(6);
		t.left = new TreeNode(2);
		t.right = new TreeNode(8);
		t.left.left = new TreeNode(0);
		t.left.right = new TreeNode(4);
		t.left.right.left = new TreeNode(3);
		t.left.right.right = new TreeNode(5);
		t.right.left = new TreeNode(7);
		t.right.right = new TreeNode(9);
		TreeNode result = lowestCommonAncestor(t, t.left, t.left.right.right.right);
		System.out.println(result.val);
		//System.out.println(ancestors(t,t.left, t.left.right.right.right));
	}
/*    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<Integer,TreeNode> map1 = new HashMap<>();
        map1.put(0, root);
        HashMap<Integer,TreeNode> map2 = new HashMap<>();
        map2.put(0, root);
        ancestor(root,p,map1,0);
        for(Entry<Integer,TreeNode> e:map1.entrySet()){
        	System.out.println(e.getKey()+ " " + e.getValue().val);
        }
        ancestor(root,q,map2,0);
        for(Entry<Integer,TreeNode> e:map2.entrySet()){
        	System.out.println(e.getKey()+" "+e.getValue().val);
        }
    	return null;
    }
    public static void ancestor(TreeNode root,TreeNode p,HashMap<Integer,TreeNode> map,int treelevel){   	
    	if(p==null || root == null){
    		return;
    	}
    	if(root.left !=null & ancestors(root,root.left,p)){
    		map.put(treelevel+1, root.left);
    	}
    	if(root.right !=null & ancestors(root,root.right,p)){
    		map.put(treelevel+1, root.right);
    	}
    	ancestor(root.left,p,map,treelevel+1);
    	ancestor(root.right,p,map,treelevel+1);
    }
    public static boolean ancestors(TreeNode root,TreeNode p, TreeNode q){
    	if(root == null){
    		return false;
    	}
    	if(root == p){
    		return true;
    	}
    	if(p == q){
    		return true;
    	}
    	if(p.left != null || p.right != null){
    		if(p.left ==q || p.right == q){
    			return true;
    		}else{
    			return (ancestors(root,p.left,q) || ancestors(root,p.right,q));
    		}
    	}
    	return false;
    	
    }*/
	//请注意是binary search tree!!!!!!!!!!!!!!!
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    while ((root.val - p.val) * (root.val - q.val) > 0)
	        root = p.val < root.val ? root.left : root.right;
	    return root;
	}

	//循环：
	 /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            else
                return root;
        }
    }

	 */
	/*迭代
	 * public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
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
