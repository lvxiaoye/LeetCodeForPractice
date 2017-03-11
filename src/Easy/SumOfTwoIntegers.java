/**
 * sum two integers without + or -
 *     /** 
     * 不用加减乘除做加法； 
     * 十进制中的18和7相加；可以分成这样三步来计算：一.无进位的各个位相加得18+7=15；二.18加7的进位是10 
     * 三.用一和二的结果相加15+10=25 
     * 对数字运算除了使用四则运算，那就剩下位运算了，而位运算是针对二进制的运算 
     * 18在计算机中用：10010   7在计算机中用：111 
     * 一.无进位的各个位相加得10010+111=10101；注意观察相加的结果值和  这两个数进行异或的值相等 
     * 二.进位是10010+111=100  求两数相加的进位，相当于两数做按位与运算后再左移一位 
     * 三.再用10101+100发现还有进位，用10101和100重复第一第二步骤，异或得10001 
     *   按位与后左移一位得 进位值是1000 
     *   此时10001+1000=11001 没有进位，相当于两数做异或运算 
     *    
     *   所以编程时，只要写一个循环 对两个数反复做  异或和按位与后左移一位操作  直到没有进位后 
     *   输出两个数的异或值。
 */
package Easy;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		int c = -4;
		System.out.println(getSum(a,b));
		System.out.println(getSum(a,c));
	}
    public static int getSum(int a, int b) {
        int sum, carry;
       do{ 
    	 sum = a^b;
        carry = (a&b)<<1;
        a = sum;
        b = carry;
       }while(carry !=0);
    	
       return sum;
    }
    /**
     * // Iterative
public int getSum(int a, int b) {
	if (a == 0) return b;
	if (b == 0) return a;

	while (b != 0) {
		int carry = a & b;
		a = a ^ b;
		b = carry << 1;
	}
	
	return a;
}

// Iterative
public int getSubtract(int a, int b) {
	while (b != 0) {
		int borrow = (~a) & b;
		a = a ^ b;
		b = borrow << 1;
	}
	
	return a;
}

// Recursive
public int getSum(int a, int b) {
	return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
}

// Recursive
public int getSubtract(int a, int b) {
	return (b == 0) ? a : getSubtract(a ^ b, (~a & b) << 1);
}

// Get negative number
public int negate(int x) {
	return ~x + 1;
}
     */

}
