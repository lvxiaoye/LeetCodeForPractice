/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

tag: easy
 */
package Easy;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.println("Please input the number of array:");
	        int num = sc.nextInt();
	        int[] arr = new int[num];
	        for(int i = 0;i<num;i++){
	            System.out.println("Please input Nr "+i+" ; " );
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Please input the special target: ");
	        int target=sc.nextInt();
	        int[] answer = twoSum(arr,target);
	        System.out.println("the original array is: "+Arrays.toString(arr));
	        System.out.println("the target number is : " + target);
	        System.out.println("the answer is : "+Arrays.toString(answer));
	}
	// the following is my solution, with high IO cost
     public static int[] twoSum(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
             for(int j=0;j<nums.length;j++){
                 if((nums[i] + nums[j] == target) & (i != j)){
                     int[] arr= {i,j};
                     return arr;
                 }
             }
         }
         return null;
     }
     
     /* the solution is almost the best one, and go through the array only once
     public int[] twoSum(int[] numbers, int target) {
    	int[] result = new int[2];
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++) {
        	if (map.containsKey(target - numbers[i])) {
            	result[1] = i + 1;
            	result[0] = map.get(target - numbers[i]);
            	return result;
        	}
         map.put(numbers[i], i + 1);
    	}
    	return result;
	 }
     */

}
