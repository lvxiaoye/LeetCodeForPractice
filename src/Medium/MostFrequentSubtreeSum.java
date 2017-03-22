/**
 * Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

Examples 1
Input:

  5
 /  \
2   -3
return [2, -3, 4], since all the values happen only once, return all of them in any order.
Examples 2
Input:

  5
 /  \
2   -5
return [2], since 2 happens twice, however -5 only occur once.
Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 */
package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MostFrequentSubtreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode t = new TreeNode(5);
		t.left=new TreeNode(2);
		t.right = new TreeNode(-5);
		int[] res = findFrequentTreeSum(t);
		for(int i:res){
			System.out.println(i+" ");
		}
	}
 /* failed in the last one; 
  *  public static int[] findFrequentTreeSum(TreeNode root) {
 
        sumNode(root);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        convert(root,map);
       
        Iterator<Entry<Integer,Integer>> iter = map.entrySet().iterator();
        int max =0;
        while(iter.hasNext()){
        	max=Math.max(max, iter.next().getValue());
        }
       // System.out.println(max);
        HashSet<Integer> res = new HashSet<Integer>();
        
        for(Entry<Integer,Integer>e :map.entrySet()){
        	if(e.getValue()==max){
        		res.add(e.getKey());
        	}
        }
        int[] r = new int[res.size()];
        Iterator<Integer> iter3= res.iterator();
        for(int i=0;i<res.size();i++){
        	r[i]=iter3.next().intValue();
        }
        return r;
        
       
    }
    
    public static void convert(TreeNode root, HashMap<Integer,Integer> map){
    	if(root == null){
    		return;
    	}
    	int count =1;
    	if(!map.containsKey(root.val)){
    		map.put(root.val,count);
    	}else{
    		map.put(root.val, count+1);
    	}
    	convert(root.left,map);
    	convert(root.right,map);  	
    }
    public static void sumNode(TreeNode root ){
    	if(root ==null){
    		return;
    	}
    	sumNode(root.left);
    	sumNode(root.right);
    	if(root.left!=null){
    		root.val+=root.left.val;
    	}
    	if(root.right!=null){
    		root.val+=root.right.val;
    	}
    	
    }*/
	   static int maxCount;
	   static HashMap<Integer,Integer> map;
	   public static int[] findFrequentTreeSum(TreeNode root) {
		   	maxCount = 0;
	        map = new HashMap<Integer, Integer>();
	        sumNode(root);
	       
	       //System.out.println(maxCount);
	        HashSet<Integer> res = new HashSet<Integer>();
	        
	        for(Entry<Integer,Integer>e :map.entrySet()){
	        	if(e.getValue()==maxCount){
	        		res.add(e.getKey());
	        	}
	        }
	        int[] r = new int[res.size()];
	        Iterator<Integer> iter3= res.iterator();
	        for(int i=0;i<res.size();i++){
	        	r[i]=iter3.next().intValue();
	        }
	        return r;
	        
	       
	    }

	    public static int sumNode(TreeNode root ){
	    	if(root ==null){
	    		return 0;
	    	}
	    	int left =sumNode(root.left);
	    	int right =sumNode(root.right);
	    	int sum = left+right+root.val;
	    	 int count = map.getOrDefault(sum, 0) + 1;
	         map.put(sum, count);
	         
	         maxCount = Math.max(maxCount, count);
	    	return sum;
	    }
    
    public static class TreeNode {
    	int val;
    	TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
   

}
