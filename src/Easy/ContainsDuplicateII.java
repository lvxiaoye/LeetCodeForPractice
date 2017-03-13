/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j 
 * in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 */
//Misunderstanding of the description..........
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,2,6,2,9,3,6};
		int[] nums2 = {-1,-1};
		int[] nums3 = {1,2};
		int[] nums4={1,1,2,1};
		System.out.println(containsNearbyDuplicate(nums4, 2));
	}
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
/*    	if(nums==null||nums.length==0){
    		return false;
    	}	
        labelA:
    	for(int i=0;i<nums.length-1;i++){
    			int j=i+1;
        		for(j=i+1;j<nums.length;j++){
        			if(nums[i]==nums[j]){
        				if(j-i>k){
        					continue labelA;
        				}else{
        					int l=j+1;
        					for(l= j+1;l<nums.length;j++){
        						if(nums[l]==nums[i]){
        							continue labelA;
        						}
        					}if(l==nums.length){
        						System.out.println(nums[i]);
        						return true;
        					}
        				}

        			}
        		}

        	
        }
        return false;
    }*/
    	/*
    	 * Explanation: It iterates over the array using a sliding window. 
    	 * The front of the window is at i, the rear of the window is k steps back. 
    	 * The elements within that window are maintained using a set. While adding new element to the set,
    	 *  if add() returns false, it means the element already exists in the set. At that point, we return true.
    	 *   If the control reaches out of for loop, it means that inner return true never executed, meaning no
    	 *    such duplicate element was found.
    	 */
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < nums.length; i++){
                if(i > k) set.remove(nums[i-k-1]);
                if(!set.add(nums[i])) return true;
            }
            return false;
/*        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;*/
     
    }
}
