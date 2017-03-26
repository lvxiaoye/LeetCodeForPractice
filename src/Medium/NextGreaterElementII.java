/**
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

Example 1:
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number; 
The second 1's next greater number needs to search circularly, which is also 2.
 */
package Medium;


public class NextGreaterElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={5,4,3,2,1};
		int[] res = nextGreaterElements(nums);
		for(int i:res){
			System.out.print(i+"　");
		}
	}
	
    public static int[] nextGreaterElements(int[] nums) {
    	int n=nums.length;
    	int[] res = new int[n];
    	if(nums.length<=0){
        	return res;
        }
    	int max=nums[0];
    	for(int i=0;i<n;i++){
    		max=Math.max(max, nums[i]);
    	}
    	for(int i=0;i<n;i++){
    		if(nums[i]==max){
    			res[i]=-1;
    		}else{
    			for(int j=i+1;j<n-1;j++){
    				if(nums[j]>nums[i]){
    					res[i]=nums[j];
    					if(nums[n-1]==nums[i]){
    						res[n-1]=res[i];
    					}
    					break;
    				}else{
    					for(int k=0;k<i;k++){
    						if(nums[k]>nums[i]){
    							res[i]=nums[k];
    						}
    					}
    				}
    			}
    		}
    		
    	}
    	
    	return res;
    }

}
