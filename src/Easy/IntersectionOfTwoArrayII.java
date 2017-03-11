/**
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
package Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionOfTwoArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1};
		int[] nums2 = {1};
		int[] result = intersect(nums1, nums2);
		for(int i:result){
			System.out.print(i+" ");
		}

	}
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2==null){
        	return null;
        }
        if(nums1.length ==0||nums2.length == 0){
        	return nums1.length == 0?nums1:nums2;
        }
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i:nums1){
        	l1.add(i);
        }
        for(int i:nums2){
        	if(l1.contains(i)){
        		int index=l1.indexOf(i);
        		result.add(i);
        		l1.remove(index);
        	}
        }
        int[] r = new int[result.size()];
        Iterator<Integer> iter = result.iterator();
        int i=0;
        while(iter.hasNext()){
        	r[i] = iter.next().intValue();
        	i++;
        }
        return r;
    }
    /**
     * public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++)
       {
           r[i] = result.get(i);
       }
    
       return r;
    }
}
     */
    /**这个方案就解决了第一个问题：如果需要排序应该怎么办
     *  Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pnt1 = 0;
        int pnt2 = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while((pnt1 < nums1.length) &&(pnt2< nums2.length)){
            if(nums1[pnt1]<nums2[pnt2]){
                pnt1++;
            }
            else{
                if(nums1[pnt1]>nums2[pnt2]){
                    pnt2++;
                }
                else{
                    myList.add(nums1[pnt1]);
                    pnt1++;
                    pnt2++;
                }
            }
        }
        int[] res = new int[myList.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = (Integer)myList.get(i);
        }
        return res;
     */
    /**
     * What if elements of nums2 are stored on disk, and the memory is
	limited such that you cannot load all elements into the memory at
	once?
	If only nums2 cannot fit in memory, put all elements 
	of nums1 into a HashMap, read chunks of array that fit into the memory, 
	and record the intersections.

	If both nums1 and nums2 are so huge that neither fit into the memory,
	 sort them individually (external sort), then read 2 elements from each
	  array at a time in memory, record intersections.
     */

}
