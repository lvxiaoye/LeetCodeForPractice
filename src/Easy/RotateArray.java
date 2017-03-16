/**
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II
 */
package Easy;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7};
		rotate(nums,3);
		for(int i:nums){
			System.out.print(i+"　");
		}

	}
	
/* time limit exceed 
 *   public static void rotate(int[] nums, int k) {
    	if(nums==null||nums.length==0){
    		return;
    	}
    	for(int i=0;i<k;i++){
    		int temp = nums[nums.length-1];
        	for(int j=nums.length-1;j>0;j--){
        		nums[j]=nums[j-1]; 
        	}
      		nums[0]=temp;
    	}
        
    }*/

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
	    if(k==n) return;
	    if(k==0) return;
	    if(n<=1) return;
    	
    	for(int i=0;i<k%n;i++){
    		int temp = nums[nums.length-1];
        	for(int j=nums.length-1;j>0;j--){
        		nums[j]=nums[j-1]; 
        	}
      		nums[0]=temp;
    	}
        
    }
	/*	public void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	}
	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}*/
	/*
	 * public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1){
            return;
        }
        //step each time to move
        int step = k % nums.length;
        int[] tmp = new int[step];
        for(int i = 0; i < step; i++){
            tmp[i] = nums[nums.length - step + i];
        }
        for(int i = nums.length - step - 1; i >= 0; i--){
            nums[i + step] = nums[i];
        }
        for(int i = 0; i < step; i++){
            nums[i] = tmp[i];
        }
        
    }
    
}
	 */
	/*
	 * Method 1: ( Interesting way, O(n) time cost, O(1) space cost)

public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1){
            return;
        }
        //step each time to move
        int step = k % nums.length;
        //find GCD between nums length and step
        int gcd = findGcd(nums.length, step);
        int position, count;
        
        //gcd path to finish movie
        for(int i = 0; i < gcd; i++){
            //beginning position of each path
            position = i;
            //count is the number we need swap each path
            count = nums.length / gcd - 1;
            for(int j = 0; j < count; j++){
                position = (position + step) % nums.length;
                //swap index value in index i and position
                nums[i] ^= nums[position];
                nums[position] ^= nums[i];
                nums[i] ^= nums[position];
            }
        }
    }
    
    public int findGcd(int a, int b){
        return (a == 0 || b == 0) ? a + b : findGcd(b, a % b);
    }
    
}
	 */

}
