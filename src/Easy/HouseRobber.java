/**
 * ou are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
package Easy;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums ={1000,200,45,4500,300,70,3400};
		int[] nums2={1,1,2,1};
		System.out.println(rob(nums));
		
	}
/*	time limit exceed:
 * public static int rob(int[] nums) {    
    	if(nums == null || nums.length==0){
    		return 0;
    	}
    	return maxSoFar(nums, nums.length-1);
    	
	}	
	public static int maxSoFar(int[] nums, int i){
		if(i==0){
			return nums[i];
		}
		if(i ==1){
			return Math.max(nums[0], nums[1]);
		}
		if(i==2){
			return Math.max(nums[0]+nums[2],nums[1]);
		}
		else {
			return Math.max(nums[i] + Math.max(maxSoFar(nums,i-2),maxSoFar(nums,i-3)),maxSoFar(nums,i-1));
		}
		
	}*/
	public static int rob(int[] nums) {    
    	if(nums == null || nums.length==0){
    		return 0;
    	}
    	int[] sum = new int[nums.length];
    	for(int i=0;i<nums.length;i++){
    		if(i==0){
    			sum[0]= nums[0];
    		}else if(i==1){
    			sum[1]= Math.max(nums[0], nums[1]);
    		}else if(i==2){
    			sum[2] =Math.max(nums[0]+nums[2],nums[1]);
    		}if(i>=3)
    			sum[i] = Math.max(sum[i-1], nums[i]+Math.max(sum[i-2],sum[i-3]));
		}
    	return sum[nums.length-1];
    	
	}	
	/**
	 * public int rob(int[] num) {
    int prevNo = 0;
    int prevYes = 0;
    for (int n : num) {
        int temp = prevNo;
        prevNo = Math.max(prevNo, prevYes);
        prevYes = n + temp;
    }
    return Math.max(prevNo, prevYes);
}
	 */
	/**
	 * #define max(a, b) ((a)>(b)?(a):(b))
	int rob(int num[], int n) {
    int a = 0;
    int b = 0;
    
    for (int i=0; i<n; i++)
    {
        if (i%2==0)
        {
            a = max(a+num[i], b);
        }
        else
        {
            b = max(a, b+num[i]);
        }
    }
    
    return max(a, b);
}
	 */

}
