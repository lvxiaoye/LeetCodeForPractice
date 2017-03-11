/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
package Easy;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		int[] nums2 = {0,0,1};
		moveZeroes(nums);
		for(int i:nums){
			System.out.print(i+" ");
		}

		
	}
    public static void moveZeroes(int[] nums) {
    	labelA:
    	for(int i=0;i<nums.length;i++){
    		if(nums[i] ==0){
    			int j;
    			for(j=i;j<nums.length-1;j++){
    				nums[j] = nums[j+1];
    			}
    			nums[nums.length-1] = 0;
    			if(nums[i]==0){
    				labelB:
    				for(j=i+1;j<nums.length-1;j++ ){
    					if(nums[j]!=0){
    						i--;
    						break labelB;
    					}
    					if(j==nums.length-2){
    						break labelA;
    					}
    					
    				}
    			}
    		}
    	}
    }
    /*
     * // Shift non-zero values as far forward as possible
   // Fill remaining space with zeros

public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}
     */

}
