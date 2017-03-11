/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */
package Easy;


import java.util.LinkedList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3};
		int[] result = plusOne(input);
		for(int i:result){
			System.out.print(i+" ");
		}

	}
    public static int[] plusOne(int[] digits) {
        if(digits == null ||digits.length ==0){
        	return null;
        }
        int carry=0;
        List<Integer> l = new LinkedList<>();
        int a =digits[digits.length-1]+1;
        if(a>=10){
        	l.add(a%10);
        	carry =a-9;
        }else{
        	l.add(a);
        	carry =0;
        }
        for(int i=digits.length-2;i>=0;i--){
        	int num = digits[i]+carry;
        	if(num>=10){
        		l.add(num%10);
        		carry = num-9;
        	}else{
        		l.add(num);
        		carry =0;
        	}
        }
        if(carry!=0){
        	l.add(carry);
        }
        int[] result = new int[l.size()];
        for(int i=0;i<l.size();i++){
        	result[i] = l.get(l.size()-1-i);
        }
        return result;
    }
    /*
     * public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}
     */

}
