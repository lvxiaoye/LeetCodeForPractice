/**
 * You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 */
package Easy;

public class PathSumIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(10);
		t.left = new TreeNode(5);
		t.right = new TreeNode(-3);
		t.left.left = new TreeNode(3);
		t.left.right = new TreeNode(2);
		t.left.left.left = new TreeNode(3);
		t.left.left.right = new TreeNode(-2);
		t.left.right.left = null;
		t.left.right.right = new TreeNode(1);
		t.right.left = null;
		t.right.right = new TreeNode(-3);
		t.right.right.right = new TreeNode(11);
		System.out.println(pathSum(t,8));

	}
/*
 * Each time find all the path start from current node
Then move start node to the child and repeat.
Time Complexity should be O(N^2) for the worst case and O(NlogN) for balanced binary Tree.
 */
    public static int pathSum(TreeNode root, int target) {
        if(root==null){
        	return 0;
        }
 
        return findPath(root,target) + pathSum(root.left,target)+pathSum(root.right,target);
    }
    
    private static int findPath(TreeNode root, int target) {
		// TODO Auto-generated method stub
		int res = 0;
		if(root == null){
			return res;
		}
		if(root.val == target){
			res+=1;
		}
		res+=findPath(root.left,target-root.val);
		res+=findPath(root.right,target-root.val);
    	return res;
	}

	public static class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int i){
    		val = i;
    	}
    }
	/**
	 * A better solution is suggested in 17ms O(n) java prefix sum by tankztc. 
	 * It use a hash map to store all the prefix sum and each time check if the any 
	 * subarray sum to the target, add with some comments:
	 * 
	 *public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  //Default sum = 0 has one count
        return backtrack(root, 0, sum, map); 
    }
    //BackTrack one pass
    public int backtrack(TreeNode root, int sum, int target, Map<Integer, Integer> map){
        if(root == null)
            return 0;
        sum += root.val;
        int res = map.getOrDefault(sum - target, 0);    //See if there is a subarray sum equals to target
        map.put(sum, map.getOrDefault(sum, 0)+1);
        //Extend to left and right child
        res += backtrack(root.left, sum, target, map) + backtrack(root.right, sum, target, map);
        map.put(sum, map.get(sum)-1);   //Remove the current node so it wont affect other path
        return res;
    }
	 */
}
