/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
package Easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2147483647};
		System.out.println(minMoves(nums));

	}
	
	public static int minMoves(int[] nums){
		if(nums == null) return 0;
		int min = nums[0];
		for(int n:nums){
			min = Math.min(n, min);
		}
		int sum = 0;
		for(int n:nums){
			sum+=(n-min);
		}
		return sum;
	}
/*stack overflow
    public static int minMoves(int[] nums) {
        int count = 0;
    	Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        	nums[i]+=1;
        }
        count+=1;
        if(equal(nums) == false){
        	count+=minMoves(nums);
        }
        return count;
    }
    
    public static boolean equal(int[] nums){
    	int i=0;
    	for(i=0;i<nums.length-1;i++){
    		if(nums[i]!=nums[i+1]){
    			return false;
    		}
    	}
    	return true;

    }*/
    
}
