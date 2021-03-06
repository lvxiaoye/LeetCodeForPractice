/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

Hint:

Try two pointers.
Did you use the property of "the order of elements can be changed"?
What happens when the elements to remove are rare?
 */
package Easy;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,2,2,3,4,2};
		System.out.println(removeElement(nums, 2));
	}
   
	public static int removeElement(int[] nums, int val) {
		int count=0,same = 0;
		for(int i =0;i<nums.length-same;i++){
        	if ((val^nums[i]) !=0){
        		count+=1;
        		continue;
        	}else{
        		for(int j=i;j<nums.length-1-same;j++){
        			nums[j]=nums[j+1];
        		}
        		same+=1;
        		i--;
        	}
        		
        }
		for(int i: nums){
			System.out.print(i+" ");
		}
		System.out.println("\n");
    	return count;
    }
	/*
	 * int removeElement(int A[], int n, int elem) {
    int begin=0;
    for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
    return begin;
}
	 */

}
