/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows
 */
package Easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(-1563847412));
	}
    public static int reverse(int x) {
    	if(x>Integer.MAX_VALUE || x<-Integer.MAX_VALUE){
    		return 0;
    	}
    	long rev=0;
        while(x!=0){
        	rev = rev*10+x%10;
        	x = x/10;
        }
        return (rev>Integer.MAX_VALUE || rev<-Integer.MAX_VALUE?0:(int)rev);
    }

    /**
     * public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
     */
}
