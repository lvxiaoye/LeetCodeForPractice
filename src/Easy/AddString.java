/**
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
package Easy;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1= "9333852702227987";
		String num2 = "85731737104263";
		String num3 = "199";
		String num4 = "1";
		System.out.println(addStrings(num3, num4));
		System.out.print(addStrings(num1, num2));

	}
/*    public static String addStrings(String num1, String num2) {
    	if(num1 == null || num2 == null){
    		return null;
    	}
    	if(num1.length() == 0||num2.length() ==0){
    		return num1.length()==0?num2:num1;
    	}
    	long n1 =0L,n2=0L;
        for(int i=num1.length()-1;i>=0;i--){
        	n1+= (num1.charAt(i)-48)*Math.pow(10, num1.length()-1-i);
        }
        for(int i=num2.length()-1;i>=0;i--){
        	n2+= (num2.charAt(i)-48)*Math.pow(10, num2.length()-1-i);
        }
        long result = n1+n2;
        return result+"";
    }*/
   
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }


}
