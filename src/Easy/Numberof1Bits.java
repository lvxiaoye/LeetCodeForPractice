/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
package Easy;

public class Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(hammingWeight(11));
	}
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
       int sum = 0;
       while(n!=0){
    	   sum+= n&1 ;
    	   n>>>=1;
       }
       return sum;
    }
    /* n&n-1的时候 每与一次少一个1，因为n-1+1进位得到一个1，所以与几次就少几个1，直到n为0
     * public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
}
     */

}
