/**
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.

Example:
Input: 4, 14, 2

Output: 6

Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
Note:
Elements of the given array are in the range of 0 to 10^9
Length of the array will not exceed 10^4.
 */
package Medium;

/*
 *   a = 0 0 0 1 0
    b = 1 0 0 1 1
    c = 0 1 0 0 1
    d = 1 0 0 1 0
    e = 0 0 0 1 0
                ↑
    ones: b, c
    zeros: a, d, e
    
    pairs that make distance are:
    b: a, d, e
    c: a, d, e

    So we have 2 ones and 5 - 2 = 3 zeros
    Total distance = 2 * 3
    then we move the pointer one position left, i.e. all the numbers right shift by 1 (num >>> 1)
 */
public class TotalHammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,14,2};
		System.out.println(totalHammingDistance(nums));

	}
	
    public static int totalHammingDistance(int[] nums) {
        if(nums.length==0){
        	return 0;
        }
        int res = 0, n = nums.length;
        for(int i=0;i<32;i++){
        	int numberOne = 0;
        	for(int j=0;j<n;j++){
        		if((nums[j] & 1) ==1){
        			numberOne+=1;
        		}
        			nums[j] = nums[j] >>>1;
        		
        		
        	}
        	res =res+numberOne *(n-numberOne);
        }
        return res;
    }
   /* public int totalHammingDistance(int[] nums) {
        int n = 31;
        int len = nums.length;
        int[] countOfOnes = new int[n];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                countOfOnes[j] += (nums[i] >> j) & 1;
            }
        }
        int sum = 0;
        for (int count: countOfOnes) {
            sum += count * (len - count);
        }
        return sum;
    }*/
}
