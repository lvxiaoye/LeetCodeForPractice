/**
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
package Easy;

public class ExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s0 = "AB";
		String s1 = "BaC";
		String s2 ="B";
		String s3 = "BCD";
		System.out.println(titleToNumber(s3));

		
	}

    public static int titleToNumber(String s) {
        if(s == ""){
        	return -1;
        }
        int length = s.length();
        int result =0;
        for(int i=0;i<length;i++){
        	result += (s.charAt(i)-64) * (Math.pow(26, (length-(i+1))));
        }
        return result;
    }
}
