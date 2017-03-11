/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,4,5,6,7,2,5,6,7};
		System.out.println(singleNumber(nums));

	}
	public static int singleNumber(int[] nums) {
		if(nums == null){
			return 0;
		}
		Set<Integer> s = new HashSet<Integer>();
		for(int n : nums){		
			if(s.contains(n)){
				s.remove(n);
			}else{
				s.add(n);
			}
		}
	
		return s.iterator().next();
   }
	
	/*
 	public int singleNumber(int[] nums) {
    int ans =0;
    
    int len = nums.length;
    for(int i=0;i!=len;i++)
        ans ^= nums[i];
    
    return ans;
    
}
	 */

}
