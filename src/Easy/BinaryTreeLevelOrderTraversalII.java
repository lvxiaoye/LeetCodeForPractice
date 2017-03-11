/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Easy.LowestCommonAncestorofaBinarySearchTree.TreeNode;


public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode t = new TreeNode(3);
		t.left = new TreeNode(9);
		t.right = new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);
		t.right.left.left = new TreeNode(1);
		t.right.left.right = new TreeNode(2);
		BinaryTreeLevelOrderTraversalII bt = new BinaryTreeLevelOrderTraversalII();
		List<List<Integer>> result = bt.levelOrderBottom(t);
		for(List<Integer>l:result){
			System.out.print(l.toString());
		}
	}
/* 错误   
 * public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    	if(root==null){
    		return null;
    	}
    	List<Integer>value = new ArrayList<>();
    	value.add(root.val);
    	List<List<Integer>> result = new ArrayList<>();
    	
    	addNode(root.right,result);
    	addNode(root.left,result);
    	addNode(root,result);
    	
        return result;
    }
    private static void addNode(TreeNode root,List<List<Integer>> result) {
		// TODO Auto-generated method stub
    	if(root == null){
    		return;
    	}
    	List<Integer> l = new ArrayList<>();
    	if(root.left!=null){  		
    		l.add(root.left.val);
    	}
    	if(root.right !=null){
    		l.add(root.right.val);
    	}
    	result.add(l);
    	addNode(root.right,result);
    	addNode(root.left,result);
	}*/
    

/*        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
            System.out.println(wrapList.size());
            levelMaker(wrapList, root, 0);
            return wrapList;
        }
        
        public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
            if(root == null) return;
            if(level >= list.size()) {
                list.add(0, new LinkedList<Integer>());
            }
            levelMaker(list, root.left, level+1);
            levelMaker(list, root.right, level+1);
            list.get(list.size()-level-1).add(root.val);
        }*/
//?????????????????????????????????????????????????
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
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


