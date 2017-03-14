/**
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:

Input:
3

Output:
3
Example 2:

Input:
11

Output:
0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.

 */
package Easy;

import java.util.HashMap;

public class NthDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthDigit(10));//expect:3

	}
    public static int findNthDigit(int n) {
    	HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0;
		for(int i=1;i<100;i++){
			sum += 9*i*Math.pow(10, i-1);
			System.out.println(sum+" "+i+" "+Math.pow(10, i-1));
			map.put(i-1, sum);
			if(sum==Integer.MAX_VALUE){
				break;
			}
		}
		for(int i=0;i<map.size();i++){
			System.out.println(i+" "+map.get(i));
		}
    	if(n<10){
        	return n;
        }
		for(int i=1;i<map.size();i++){
			if(n<=map.get(i)){
				int x=map.get(i-1);
				int index = (n-x)%(i+1);
				int num;
				if(index ==0){
					num=(n-x)/(i+1)+(int)(Math.pow(10, i)-1);
				}else
					num = (n-x)/(i+1)+1+(int)(Math.pow(10, i)-1);
				System.out.println(n +" "+i+" "+x+" "+num+" "+index);
				String res = String.valueOf(num);
				if(index==0){
					return res.charAt(i-index)-48;
				}else{
					return res.charAt(index-1)-48;
				}
			}
		}
        return 0;
    }
    /*
     * 	public int findNthDigit(int n) {
		int len = 1;
		long count = 9;
		int start = 1;

		while (n > len * count) {
			n -= len * count;
			len += 1;
			count *= 10;
			start *= 10;
		}

		start += (n - 1) / len;
		String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % len));
	}
     */
    /*
     * public int findNthDigit(int n) {
    n -= 1;
    int digits = 1, first = 1;
    while (n / 9 / first / digits >= 1) {
        n -= 9 * first * digits;
        digits++;
        first *= 10;
    }
    return (first + n/digits + "").charAt(n%digits) - '0';
}
     */

}
