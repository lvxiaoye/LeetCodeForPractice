/**
 * Given an integer, write a function to determine if it is a power of three.

Follow up:
	Could you do it without using any loop / recursion?
 */
package Easy;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(9));

	}
/* 迭代21ms   
 * public static boolean isPowerOfThree(int n) {
    	if( n==1){
    		return true;
    	}
    	if(n==0){
    		return false;
    	if(n%3 == 0){
    		return isPowerOfThree(n/3);
    	}else{
    		return false;
    	}
    	
    }
    */ 
	//循环20ms
    public static boolean isPowerOfThree(int n) {
    	if( n==1){
    		return true;
    	}
    	if(n <= 0){
    		return false;
    	}
    	
    	while(n!= 1){
    		if(n%3 == 0){
    			n = n/3;
    		}else{
    			return false;
    		}
    	}
    	
    	return true;
    	
    	
    }
    /**
     * public class Solution {
public boolean isPowerOfThree(int n) {
    // 1162261467 is 3^19,  3^20 is bigger than int  
    return ( n>0 &&  1162261467%n==0);
}
     */
    /**https://discuss.leetcode.com/topic/33536/a-summary-of-all-solutions-new-method-included-at-15-30pm-jan-8th/2
     * 
     */

}
