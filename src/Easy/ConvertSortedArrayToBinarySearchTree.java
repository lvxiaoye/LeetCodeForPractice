/*
 * Given an array where elements are sorted in ascending order, convert it to a
 *  height balanced BST.
 */
package Easy;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		TreeNode result = sortedArrayToBST(a);
		System.out.println(result.toString());
		

	}
    public static TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length ==0 || nums == null){
    		return null;
    	}
    	return help(nums,0,nums.length-1);
    }
    
    private static TreeNode help(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		if(j<i){
			return null;
		}
		int median = (i+j)/2;
    	TreeNode m = new TreeNode(nums[median]);
		m.left = help(nums,i,median-1);
		m.right = help(nums,median+1,j);
		return m;
	}

	public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x){
    		val = x;
    	}
		public String toString(){
			if(left ==null & right ==null){
				return val+" ";
			}else if(left == null){
				return val + "\n" +right.toString();
			}else if(right == null){
				return val+ "\n" + left.toString();
			}
				return  val+"\n"+ left.toString() + right.toString();
		}

    }
	/**
	 * 不会print树。。。。。
	 */


}
