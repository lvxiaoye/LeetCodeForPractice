/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
 * find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?
 */
package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,3};
		int[] nums2 = {0};
		System.out.println(missingNumber(nums));

	}
    public static int missingNumber(int[] nums) {
    	if(nums == null || nums.length ==0 ){
    		return -1;
    	}
    	Set<Integer> map = new HashSet<Integer>();
        if(nums.length ==1){
        	return nums[0]==0?1:0;
    	}
    	for(int i=0;i<=nums.length;i++){
    		map.add(i);
    	}
    	for(int i:nums){
    		if(map.contains(i)){
    			map.remove(i);
    		}
    	}
    	Iterator<Integer> iter = map.iterator();
    	return iter.next();
    }
    /**
     * public int missingNumber(int[] nums) {

    int xor = 0;
    int i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
}
     */

}
