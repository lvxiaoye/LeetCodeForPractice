/**
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
package Easy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("100", ""));

	}
    public static String addBinary(String a, String b) {
    	if(a.length()==0 & b.length() ==0){
    		return "0";
    	}
    	if(a==null||a.length() ==0){
    		return b;
    	}else if(b==null||b.length()==0){
    		return a;
    	}
    	char[] n = a.toCharArray();
    	char[] m = b.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	int carry=0;
    	int i=n.length-1,j=m.length-1;
    	while(i>=0||j>=0){
    		int sum=0;
    		if(i<0){
    			sum=m[j]-48+carry;
    			j--;
    		}else if(j<0){
    			sum=n[i]-48+carry;
    			i--;
    		}else{
    			sum=m[j]+n[i]-96+carry;
    			i--;
        		j--;
    		}
    		sb.append(sum%2);
    		carry=sum/2;
    		
    	}
    	
    	if(carry!=0){
    		sb.append(carry);
    	}
    	return sb.reverse().toString();
    }
    /**
     * public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
    }
}
     */

}
