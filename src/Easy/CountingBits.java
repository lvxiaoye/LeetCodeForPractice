/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
Hint:

You should make use of what you have produced already.
Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
Or does the odd/even status of the number help you in calculating the number of 1s?
 */
package Easy;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = countBits(64);
		for(int i:result){
			System.out.print(i +" ");
		}
	}

    public static int[] countBits(int num) {
    	int[] result = new int[num+1];
    	for(int i=0;i<=num;i++){
    		if(i==0){
    			result[0] = 0;
    			continue;
    		}else
    		if(i==1){    			
    			result[1] = 1;
    			continue;
    		}else{
    			int k = (int) (Math.log(i)/Math.log(2));
    			result[i] = 1+ result[i- (int)Math.pow(2, k)];
    			
    		}
    	}
        return result;
    }
    /*
     * public int[] countBits(int num) {
    int[] f = new int[num + 1];
    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
}
     */
    /*
     * public int[] countBits(int num) {
    int[] ret = new int[num+1];
    ret[0] = 0;
    int pow = 1;
    for(int i = 1, t = 0; i <= num; i++, t++) {
        if(i == pow) {
            pow *= 2;
            t = 0;
        }
        ret[i] = ret[t] + 1;
    }
    return ret;
}
     */
}
