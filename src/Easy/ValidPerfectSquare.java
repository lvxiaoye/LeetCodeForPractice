/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */
package Easy;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(14));
	}
    public static boolean isPerfectSquare(int num) {
        if(num ==1 || num ==4 || num==9 || num ==16 || num ==25){
        	return true;
        }
        for(int i=0;i<num/5;i++){
        	if(i*i == num){
        		return true;
        	}
        }
        return false;
    }

    /**
     * public boolean isPerfectSquare(int num) {
     int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
 }
The time complexity is O(sqrt(n)), a more efficient one using binary search whose time complexity is O(log(n)):

public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
One thing to note is that we have to use long for mid to avoid mid*mid from overflow. Also, you can use long type for low and high to avoid type casting for mid from long to int.
And a third way is to use Newton Method to calculate the square root or num, refer to Newton Method for details.

public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
     */
}
