/**
 * Given an integer, write a function to determine if it is a power of two.
 */
package Easy;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(24));
		System.out.println(isPowerOfTwo(32));
		double n = Math.pow(2, 30);
		System.out.println(n>Integer.MAX_VALUE?true:false);

	}
  /*  public static boolean isPowerOfTwo(int n) {
        if(n<=0){
        	return false;
        }
        if(n == 1){
        	return true;
        }
        if(n%2 == 0){
        	return isPowerOfTwo(n/2);
        }else
        	return false;
    }*/
 /*  public static boolean isPowerOfTwo(int n){
        if(n<=0){
        	return false;
        }
        if(n == 1){
        	return true;
        }
        while(n!=1){
        	if(n %2 !=0){
        		return false;
        	}
        	n=n/2;
        }
        return true;
    }*/
    
    public static boolean isPowerOfTwo(int n){
    	if(n<=0){
    		return false;
    	}
    	return Math.pow(2, 30)%n ==0;
    }
       		
}
