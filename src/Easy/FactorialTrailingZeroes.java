/**
 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
 */
package Easy;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(13));
	}

    public static int trailingZeroes(int n) {
    	if(n==0){
    		return 0;
    	}
    	int res=0;
        while(n!=0){
        	res += n/5;
        	n/=5;
        }

        return res;
    }
    /*
     *  return n>=5 ? n/5 + trailingZeroes(n/5): 0;
     */
}
