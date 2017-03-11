/**
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 */
package Easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class AAAAAAANotKnownFindModeinBinarySearchTree {

    Map<Integer, Integer> map; 
    int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(2);
		AAAAAAANotKnownFindModeinBinarySearchTree a = new AAAAAAANotKnownFindModeinBinarySearchTree();
		int[] result = a.findMode(root);
		for(int i:result){
			System.out.print(i+" ");
		}
	}
/*    public static int[] findMode(TreeNode root) {
    	if(root == null) return null;
    	if(root.left == null & root.right == null){
    		int[] result = {root.val};
    		return result;
    	}
    	HashMap<Integer,Integer> map = new HashMap<>();
    	help(root, map);

    	Iterator<Entry<Integer, Integer>> iter1 = map.entrySet().iterator();
    	int max = iter1.next().getValue().intValue();
    	while(iter1.hasNext()){
    		int key = iter1.next().getKey().intValue();
    		int value = iter1.next().getValue().intValue();
    		if(value<max){
    			map.remove(key);
    		}else{
    			max = value;
    		}
    	}
    	int i=0;
    	int[] result = new int[map.size()];
    	for(Entry<Integer,Integer> e:map.entrySet()){
    		result[i] = e.getKey().intValue();
    	}
    	return result;
        
    }
    
    public static void help(TreeNode root, HashMap<Integer,Integer> map){
    	if(root == null) return;
    	int count =1;
    	map.put(root.val, count);
    	if(root.left == null & root.right == null){
    		return;
    	}
    	if(root.left == null){
    		help(root.right,map);
    	}else{
           	if(root.left.val == root.val){
           		map.put(root.val,count+1 );
            }
           	help(root.left,map);
    	}
    	if(root.right == null){
    		help(root.left,map);
    	}else{
    		if(root.right != null & root.right.val == root.val){
    			map.put(root.val, count+1);
    		}
    		help(root.right,map);
    	}
    	max =Math.max(max, map.get(root.val));
    	
    }*/
	

	    public int[] findMode(TreeNode root) {
	        if(root==null) return new int[0]; 
	        this.map = new HashMap<>(); 
	        
	        inorder(root); 
	        
	        List<Integer> list = new LinkedList<>();
	        for(int key: map.keySet()){
	            if(map.get(key) == max) list.add(key);
	        }
	        
	        int[] res = new int[list.size()];
	        for(int i = 0; i<res.length; i++) res[i] = list.get(i);
	        return res; 
	    }
	    
	    private void inorder(TreeNode node){
	        if(node.left!=null) inorder(node.left);
	        map.put(node.val, map.getOrDefault(node.val, 0)+1);
	        max = Math.max(max, map.get(node.val));
	        if(node.right!=null) inorder(node.right); 
	    }
	/**
	 * public class Solution {
    Integer prev = null;
    int count = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
    }
    
    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) return;
        traverse(root.left, list);
        if (prev != null) {
            if (root.val == prev)
                count++;
            else
                count = 1;
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        prev = root.val;
        traverse(root.right, list);
    }
}
	 *
	 */
    
    public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	public TreeNode(int x){
    		val = x;
    	}
    }

}
