/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

Subscribe to see which companies asked this question.
 */
package Easy;

public class TwoSumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,7,11,15};
		int target = 17;
		int[] result = twoSum(numbers,target);
		for(int i:result){
			System.out.print(i+" ");
		}

	}
    public static int[] twoSum(int[] numbers, int target) {
    	if(numbers==null || numbers.length ==1){
    		return null;
    	}
        int[] result = new int[2];
    	labelA:
    	for(int i=0;i<numbers.length-1;i++){
        	int ano = target-numbers[i];
        	if(ano != numbers[i] & numbers[i] ==numbers[i+1]){
        		continue;
        	}
        	labelB:
        	for(int j=i+1;j<numbers.length;j++){
        		if(numbers[j] == ano){
        			result[0]= i+1;
        			result[1] = j+1;
        			break labelA;
        		}
        	}
        }
    return result;
    }
    /*solution 1:
     * public int[] twoSum(int[] num, int target) {
    int[] indice = new int[2];
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            indice[0] = left + 1;
            indice[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return indice;
}


     */

}
