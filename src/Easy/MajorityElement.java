/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
package Easy;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		int[] nums1 = {7,6,5,4,4,4,4,5};
		int[] nums2 = {0};
		int[] nums3 = {8,8,7,7,7};
		System.out.println(majorityElement(nums2));

	}
    public static int majorityElement(int[] nums) {
    	if(nums.length ==1){
    		return nums[0];
    	}
    	HashMap<Integer,Long> map = new HashMap<>();
    	for(int i =0;i<nums.length;i++){
    		if(map.containsKey(nums[i])){
    			long cur = map.get(nums[i])+1;
    			map.put(nums[i], cur);
    			if(cur> nums.length/2){
    				return nums[i];
    			}
    		}else
    			map.put(nums[i], 1L);
    	}
    	return -1;
        
    }
    /**明明想到了这个方案为什么没有继续深究下去呢？
     * public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}
     */

}
