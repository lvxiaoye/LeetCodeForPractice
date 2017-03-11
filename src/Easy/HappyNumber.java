/**
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
package Easy;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(19));

	}
    public static boolean isHappy(int n) {

        while(n != 1){
        	n = compute(n);
        
        	if(n==4){
        		return false;
        	}
        }
        
    	return true;
    }

    public static int compute(int n){
    	String s = String.valueOf(n);
    	int sum = 0;
    	for(int i=0;i<s.length();i++){
    		sum += (s.charAt(i)-'0')*(s.charAt(i)-'0');
    		
    	}
    	System.out.println(sum);
    	return sum;
    }
    /**The idea is to use one hash set to record sum of every digit square of every number
     *  occurred. Once the current sum cannot be added to set, return false; once the 
     *  current sum equals 1, return true;
     * public boolean isHappy(int n) {
    Set<Integer> inLoop = new HashSet<Integer>();
    int squareSum,remain;
	while (inLoop.add(n)) {
		squareSum = 0;
		while (n > 0) {
		    remain = n%10;
			squareSum += remain*remain;
			n /= 10;
		}
		if (squareSum == 1)
			return true;
		else
			n = squareSum;

	}
	return false;

}
     */

}
