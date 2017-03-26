/**
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

Example 1:
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number; 
The second 1's next greater number needs to search circularly, which is also 2.
 */
package Medium;


public class NextGreaterElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,-1,3,-1};
		int[] res = nextGreaterElements(nums);
		for(int i:res){
			System.out.print(i+"　");
		}
	}
	
    public static int[] nextGreaterElements(int[] nums) {
    	int n=nums.length;
    	int[] res = new int[n];
    	if(nums.length<=0){
        	return res;
        }
    	int max=nums[0];
    	for(int i=0;i<n;i++){
    		max=Math.max(max, nums[i]);
    	}
    	for(int i=0;i<n;i++){
    		if(nums[i]==max){
    			res[i]=-1;
    		}else{
    			for(int j=i+1;j<n;j++){
    				if(nums[j]>nums[i]){
    					res[i]=nums[j];
    					break;
    				}else{
    					for(int k=0;k<i;k++){
    						if(nums[k]>nums[i]){
    							res[i]=nums[k];
    							break;
    						}
    					}
    				}
    			}
    		}
    		
    	}
    	if(res[n-1]==0){
    		if(nums[n-1]==max){
    			res[n-1]=-1;
    		}else{
    			for(int k=0;k<n-1;k++){
    				if(nums[k]>nums[n-1]){
    					res[n-1]=nums[k];
    					break;
    				}
    			}
    		}
    	}
    	
    	return res;
    }
    /*
     *   public int[] nextGreaterElements(int[] nums) {
        int n = nums.length, next[] = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }   
        return next;
    }
     */
    /*
     *  public int[] nextGreaterElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        int n = nums.length;
        int[] result = new int[n];
        int[] temp = new int[n * 2];
        
        for (int i = 0; i < n * 2; i++) {
            temp[i] = nums[i % n];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = -1;
            if (nums[i] == max) continue;
            
            for (int j = i + 1; j < n * 2; j++) {
                if (temp[j] > nums[i]) {
                    result[i] = temp[j];
                    break;
                }
            }
        }
        
        return result;
    }
     */

}
