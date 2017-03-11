/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
 */
package Easy;

public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(1));
	}
/*    public static boolean isPowerOfFour(int num) {
    	if(num ==0){
    		return false;
    	}
        if(num==1){
        	return true;
        }
        while(num!=1){       	
        	if(num % 4 != 0){
        		return false;
        	}
        	num = num/4;
        }
        return true;
    }*/
    public static boolean isPowerOfFour(int num) {
    	if(num ==0){
    		return false;
    	}
        if(num==1){
        	return true;
        }
        if(num %4 != 0){
        	return false;
        }
        
        	return isPowerOfFour(num/4);
        
        
    }

}
