/*
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */
package Easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,1,5};
		int[] nums2 = {2,1,3,5};
		int[] nums3 = {};
		int[] nums4 = {1};
		int[] result = intersection(nums3, nums2);
		if( result == null){
			System.out.print("null");
		}
		for(int i=0;i<result.length;i++){
			System.out.print(result[i] + " ");
		}

	}

    public static int[] intersection(int[] nums1, int[] nums2) {
    	if(nums1 == null || nums2 == null){
    		return null;
    	}
        Set<Integer> result = new HashSet<Integer>();
        for(int i: nums1){
        	for(int j:nums2){
        		if(i == j){
        			result.add(i);
        		}
        	}
        }
        if(result.size() == 0){
        	return new int[0];
        }
        int[] r = new int[result.size()];


        int i=0;
        Iterator<Integer> iter= result.iterator();
        while(iter.hasNext() && i<result.size()){
        	r[i] = iter.next();
        	i++;
        }
        return r;
    }
    
/*    public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> intersect = new HashSet<>();
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (set.contains(nums2[i])) {
                    intersect.add(nums2[i]);
                }
            }
            int[] result = new int[intersect.size()];
            int i = 0;
            for (Integer num : intersect) {
                result[i++] = num;
            }
            return result;
        }
    }*/
    
}
