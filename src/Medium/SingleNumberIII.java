/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
package Medium;

import java.util.Stack;

public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,2,5};
		int[] res = singleNumber(nums);
		for(int i:res){
			System.out.print(i+" ");
		}
	}
	/*
	 * 但是仅仅通过最后异或出来的值，是没办法求出b和c的值的，但是足以帮我们把b和c划分到不同的子数组中去。

一个整数有32位bit，对于b和c，除非两者是相同的数，否则一定存在第K位bit，两者是不同的。看下面的例子，

当找到这个K以后，就可以按照第K位bit是否等于1，将A数组划分成两个子数组，而这两个子数组分别包含了b和c，那么剩下的就只需要把single number的算法直接应用到这两个子数组上，就可以得到b和c了。
	 */
	public static int[] singleNumber(int[] nums) {
        // Pass 1 : 
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;
        
        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0){ // the bit is not set
            
                rets[0] ^= num;
            }else{ // the bit is set
            
                rets[1] ^= num;
            }
        }
        return rets;
    }

}
