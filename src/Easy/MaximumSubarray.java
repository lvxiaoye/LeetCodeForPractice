/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
package Easy;

import java.util.TreeSet;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {-2,1};
		System.out.println(maxSubArray(nums));

	}
	//两个都是时间超出要求 time limited exceed
    public static int maxSubArray(int[] nums) {
    	if(nums.length == 1){
    		return nums[0];
    	}
    	int max = nums[0];
    	//TreeSet<Integer> t = new TreeSet<Integer>();
    	for(int num:nums){
    		max = Math.max(max, num);
    	}
    	//subArray(nums,0,nums.length-1,t);
    	
    	max =subArray(nums,0,nums.length-1,max);
    	return max;
    }
/*	private static void subArray(int[] nums, int start, int end, TreeSet<Integer> t) {
		// TODO Auto-generated method stub
		
		if(start >= end){
			return;
		}
		while(start<end){
			int sum = 0;
			for(int i=start;i<=end;i++){
				sum+=nums[i];
			}
			t.add(sum);
			System.out.print(sum + " ");
			end--;
		}
		if(start<nums.length)	
			subArray(nums,start+1,nums.length-1,t);
		
	}*/
	private static int subArray(int[] nums, int start, int end, int max) {
		// TODO Auto-generated method stub
		
		if(start >= end){
			return max;
		}
		while(start<end){
			int sum = 0;
			for(int i=start;i<=end;i++){
				sum+=nums[i];
			}
			
			max = Math.max(max, sum);
			System.out.print(sum + " ");
			end--;
		}
		if(start<nums.length)	
			return subArray(nums,start+1,nums.length-1,max);
		return max;
	}
	
/*	public int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
}*/
/*	public static int maxSubArray(int[] A) {
	    int maxSoFar=A[0], maxEndingHere=A[0];
	    for (int i=1;i<A.length;++i){
	    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
	}*/

}
