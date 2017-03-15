/**
 * Implement int sqrt(int x).

	Compute and return the square root of x.
 */
package Easy;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(46340*46340);
		System.out.println(mySqrt(2147395600));
	}
    public static int mySqrt(int x) {
    	if(x==1) return 1;
        long power=0;
        for(long i=0;i<=x;i++){
        	power =i*i;
        	if(power>x){
        		return (int)i-1;
        	}
        }
        return 0;
    }
    /*
     * public int sqrt(int x) {
    long ans = 0;
    long bit = 1l << 16;
    while(bit > 0) {
        ans |= bit;
        if (ans * ans > x) {
            ans ^= bit;
        }
        bit >>= 1;
    }
    return (int)ans;
}
     */
    /*
     *  long r = x;
    while (r*r > x)
        r = (r + x/r) / 2;
    return (int) r;
     */
    /*
     * public int sqrt(int x) {
    if (x == 0)
        return 0;
    int left = 1, right = Integer.MAX_VALUE;
    while (true) {
        int mid = left + (right - left)/2;
        if (mid > x/mid) {
            right = mid - 1;
        } else {
            if (mid + 1 > x/(mid + 1))
                return mid;
            left = mid + 1;
        }
    }
}
     */

}
