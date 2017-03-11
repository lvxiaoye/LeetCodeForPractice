/**
 * Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
 */
package Easy;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(1));

	}
    public static boolean isUgly(int num) {
    	if(num == 0){
    		return false;
    	}
        if(num ==1){
        	return true;
        }
     
        while(num!=1){
        	if(num%2 ==0){
        		return isUgly(num/2);
        	}else if(num %5 ==0){
        		return isUgly(num /5);
        	}else if(num % 3 ==0){
        		return isUgly(num/3);
        	}else
        		return false;
        }
        return true;
    }
    /**
     * public boolean isUgly(int num) {
    if(num==1) return true;
    if(num==0) return false;
	while(num%2==0) num=num>>1;
	while(num%3==0) num=num/3;
	while(num%5==0) num=num/5;
    return num==1;
}
     */

}
