/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */
package Easy;

public class RangeSumQueryImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-2,0,3,-5,2,-1};
		NumArray obj = new NumArray(nums);
		int param_1 = obj.sumRange(0, 5);
		System.out.println(param_1);
	}
	public static class NumArray {
		/*		int[] num;
	    public NumArray(int[] nums) {
	        num=nums;
	    }
	    
	    public int sumRange(int i, int j) {
	    	if(this.num==null||this.num.length==0){
	    		return 0;
	    	}
	        int sum=0;
	        for(int k=i;k<=j;k++){
	        	sum+= this.num[k];
	        }
	        return sum;
	    }*/
		int[] nums;

		public NumArray(int[] nums) {
		    for(int i = 1; i < nums.length; i++)
		        nums[i] += nums[i - 1];
		    
		    this.nums = nums;
		}

		public int sumRange(int i, int j) {
		    if(i == 0)
		        return nums[j];
		    
		    return nums[j] - nums[i - 1];
		}
	}

	/**
	 * Your NumArray object will be instantiated and called as such:
	 * NumArray obj = new NumArray(nums);
	 * int param_1 = obj.sumRange(i,j);
	 */

}
