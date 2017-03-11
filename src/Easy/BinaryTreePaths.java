/**
 * Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
package Easy;

import java.util.ArrayList;
import java.util.List;

import Easy.BalancedBinaryTree.TreeNode;

public class BinaryTreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(3);
		t.left = new TreeNode(9);
		t.right = new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);
		t.right.left.left = new TreeNode(1);
		t.right.left.right = new TreeNode(2);
		List<String> tl = binaryTreePaths(t);
		for(String s : tl){
			System.out.print(s+" ");
		}
		System.out.println("\n");
		TreeNode tr = new TreeNode(4);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(7);
		tr.left.left = new TreeNode(1);
		tr.left.right = new TreeNode(3);
		tr.right.left = new TreeNode(6);
		List<String> ttr = binaryTreePaths(tr);
		for(String s : ttr){
			System.out.print(s+" ");
		}
		System.out.println("\n");
		TreeNode s = new TreeNode(1);
		s.left = new TreeNode(2);
		s.right = new TreeNode(2);
		s.left.left = new TreeNode(3);
		s.left.left.left = new TreeNode(4);
		s.right.right = new TreeNode(3);
		s.right.right.right = new TreeNode(4);
		List<String> ts = binaryTreePaths(s);
		for(String ss : ts){
			System.out.print(ss+" ");
		}
		System.out.println("\n");

	}
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<String>();
        if(root == null){
        	return l;
        }
        path(root,"",l);
        
        return l;
 
    }
    public static void path(TreeNode root, String p ,List<String> l){
    	if(root.left ==null & root.right == null){
    		l.add(p+root.val);
    	}
    	if(root.left!= null){
    		path(root.left,p+root.val+"->",l);
    		
    	}
    	if(root.right!=null){
    		path(root.right,p+root.val+"->",l);
    	}
    }
    /*
     * public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths = new LinkedList<>();

        if(root == null) return paths;
        
        if(root.left == null && root.right == null){
            paths.add(root.val+"");
            return paths;
        }

         for (String path : binaryTreePaths(root.left)) {
             paths.add(root.val + "->" + path);
         }

         for (String path : binaryTreePaths(root.right)) {
             paths.add(root.val + "->" + path);
         }

         return paths;
        
    }
     */
    /*
     * 
Categories
Home   OJ   Binary Tree Paths   Java solution using StringBuilder instead of string manipulation. 
New users please read the instructions to format your code properly. Discuss is a place to post interview questions or share solutions / ask questions related to OJ problems.
Java solution using StringBuilder instead of string manipulation.

22
C czonzhu 
Reputation:  589
 public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<String>();
        if(root == null) return rst;
        StringBuilder sb = new StringBuilder();
        helper(rst, sb, root);
        return rst;
    }
    
    public void helper(List<String> rst, StringBuilder sb, TreeNode root){
        if(root == null) return;
        int tmp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            rst.add(sb.toString());
            sb.delete(tmp , sb.length());
            return;
        }
        sb.append(root.val + "->");
        helper(rst, sb, root.left);
        helper(rst, sb, root.right);
        sb.delete(tmp , sb.length());
        return;
        
    }
}
     */
    /*
     * public class Solution {
//BFS - Queue
public List<String> binaryTreePaths(TreeNode root) {
    List<String> list=new ArrayList<String>();
    Queue<TreeNode> qNode=new LinkedList<TreeNode>();
    Queue<String> qStr=new LinkedList<String>();
    
    if (root==null) return list;
    qNode.add(root);
    qStr.add("");
    while(!qNode.isEmpty()) {
        TreeNode curNode=qNode.remove();
        String curStr=qStr.remove();
        
        if (curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
        if (curNode.left!=null) {
            qNode.add(curNode.left);
            qStr.add(curStr+curNode.val+"->");
        }
        if (curNode.right!=null) {
            qNode.add(curNode.right);
            qStr.add(curStr+curNode.val+"->");
        }
    }
    return list;
}
     */
/*    public class Solution {
    	//DFS - Stack
    	public List<String> binaryTreePaths(TreeNode root) {
    	    List<String> list=new ArrayList<String>();
    	    Stack<TreeNode> sNode=new Stack<TreeNode>();
    	    Stack<String> sStr=new Stack<String>();
    	    
    	    if(root==null) return list;
    	    sNode.push(root);
    	    sStr.push("");
    	    while(!sNode.isEmpty()) {
    	        TreeNode curNode=sNode.pop();
    	        String curStr=sStr.pop();
    	        
    	        if(curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
    	        if(curNode.left!=null) {
    	            sNode.push(curNode.left);
    	            sStr.push(curStr+curNode.val+"->");
    	        }
    	        if(curNode.right!=null) {
    	            sNode.push(curNode.right);
    	            sStr.push(curStr+curNode.val+"->");
    	        }
    	    }
    	    return list;
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
