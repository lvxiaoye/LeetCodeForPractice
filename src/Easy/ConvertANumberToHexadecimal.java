/**将整数转化为十六进制
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.
Example 1:

Input:
26

Output:
"1a"
Example 2:

Input:
-1

Output:
"ffffffff"
 */
package Easy;

public class ConvertANumberToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toHex(1));
		
	}
    public static String toHex(int num) {
    	if(num ==0){
    		return "0";
    	}
    	StringBuilder sb = new StringBuilder();
    	while(num!=0){
    		String s = Integer.toBinaryString(num);
    		//System.out.println(s);
    		while(s.length()<4){
    			s="0"+s;
    		}
    		//System.out.println(s);
    		int sum = 0;
    		for(int i=s.length()-1;i>=s.length()-4;i--){
    			//System.out.print((s.charAt(i)-'0')*Math.pow(2, (s.length()-1-i))+" ");
    			sum += (s.charAt(i)-'0')*Math.pow(2, (s.length()-1-i));
    			//System.out.println(sum);
    			
    		}
    		//System.out.println(sum);
    		sb.append(convertToCHex(sum));
    		num = num>>>4;
    	}
    	return sb.reverse().toString();
        
    }
    public static String convertToCHex(int num){
    	switch(num){
    	case 10:
    		return "a";
		case 11:
    		return "b";
		case 12:
    		return "c";
		case 13:
    		return "d";
		case 14:
    		return "e";
		case 15: 
    		return "f";
		default:
    			return num+"";
    	}
    }
    /**因为15 = “1111”,所以n&15 = n。。。。。。
     *char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    
    public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;
    }
     */
    

}
