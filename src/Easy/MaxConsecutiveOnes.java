/**Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
Subscribe to see which companies asked this question.*/
package Easy;

import java.util.HashMap;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0};
		int[] input2 = {1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
		MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
		System.out.println(mco.findMaxConsecutiveOnes(input));

	}

    public int findMaxConsecutiveOnes(int[] nums) {
    	if(nums==null){
    		return 0;
    	}
    	int count =0;
    	int max = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i] != 1){
    			count =0;
    			continue;
    		}
    		count +=1;
    		max = max>count?max:(count);
    	}

    	return max;
        
    }
    /*
     *  public int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
    } 
     */
}
