/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
package Easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3,5,8,8};
		
		System.out.println(removeDuplicates(nums));
	}
    public static int removeDuplicates(int[] nums) {
    	int res = 0;
        if(nums.length==1){
        	return 1;
        }
        for(int i=1;i<nums.length-res;i++){
        	if(nums[i] == nums[i-1]){
        		res++;
        		for(int j=i;j<nums.length-1;j++){
        			nums[j]=nums[j+1];	
        		}
        		i--;
        	}
        }
/*        for(int i=0;i<nums.length-res;i++){
        	System.out.print(nums[i]+" ");
        }*/
        return nums.length-res;
    }

    /*
     * public class Solution {
    public int removeDuplicates(int[] nums) {
    
        int i = 1; //iterator thru array
        int j = 0; //current index
        for (; i<nums.length; i++) { 
            if (nums[i] != nums[j]) { //new number
                j++; //move current index
                nums[j] = nums[i]; //fill current index with new number
            } 
        }
    return j+1;
   }
}
     */
}
