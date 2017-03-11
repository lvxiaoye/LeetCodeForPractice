/**
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array,
 *  and it should return false if every element is distinct.
 */
package Easy;

import java.util.Stack;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums ={1,1,2,3};
		int[] nums2 = {1,2,3};
		int[] nums3 = {2,18,22,22};
		int[] nums4 = {1,2,3,1};
		System.out.println(containsDuplicate(nums4));

	}

    public static boolean containsDuplicate(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return false;
    	}
    	Stack<Integer> stack = new Stack<>();   
    	stack.push(nums[0]);
		int k=0;  	
    	while(stack.size()!=0){
    		int i=0;
    		int curr = stack.pop();  		
    		for(i=k+1;i<nums.length;i++){   		
    			if(curr == nums[i]){
    				return true;
    			}
    		}
    		if(k<nums.length-1){
    			stack.push(nums[k+1]);
    			k++;
    		}
    		if(k == nums.length){
    			stack.pop();
    		}
    	}
    	return false;
        
    }
    /*上面的算法time limited;
     * public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
     */
    /*sorting can be accepted
     * public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]) return true;
    }
    return false;
}
     */
}
