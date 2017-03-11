/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
package Easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,3,5,6};
		
		System.out.println(searchInsert(num1,0 ));

	}
    public static int searchInsert(int[] nums, int target) {
    	if(nums == null || nums.length == 0){
    		return 0;
    	}
    	if(nums.length ==1 & nums[0]<target){
    		return 1;
    	}
        if(nums[0]>= target){
        	return 0;
        }else{
        	for(int i =1;i<nums.length;i++){
        		if(nums[i] < target){
        			continue;
        		}else 
        			return i;
        	}
        }
        return nums.length;
    }
    /**
     *   public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
     */

}
