/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
 */
package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> l = findDuplicates(nums);
		for(int i:l){
			System.out.println(i+" ");
		}
	}
    public static List<Integer> findDuplicates(int[] nums) {
       List<Integer> list = new ArrayList<Integer>();
       if(nums==null){
           return null;
       }
       if(nums.length == 0){
           return list;
       }
       Arrays.sort(nums);
       int pre = nums[0];
       for(int i=1;i<nums.length;i++){
    	   if(pre == nums[i] ){
    		   list.add(nums[i]);
    	   }
    	   pre = nums[i];
       }

       return list;
    }
    /*
     *     public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
     */

}
