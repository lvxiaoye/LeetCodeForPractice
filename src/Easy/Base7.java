package Easy;
/**
 * Given an integer, return its base 7 string representation.  七进制的字符串

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
 */

public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int num2 = 0;
		System.out.println(convertToBase7(num2));
	}
	
    public static String convertToBase7(int num) {
    	 if(num ==0){
             return new String("0");
         }
    	int result= Math.abs(num);
        String a = "";
        while(result != 0){
        	a += result%7;
        	result = result/7;
        }
        
        if(num<0){
        	return "-" + reverseString(a);
        }
        return reverseString(a);
       
        
    }
	public static String reverseString(String s){
		char[] word = s.toCharArray();
		int i = 0;
		int j=s.length()-1;
		char temp;
		while(i<j){
			temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}

	/*
	 * public String convertTo7(int num) {
    if (num < 0)
        return '-' + convertTo7(-num);
    if (num < 7)
        return num + "";
    return convertTo7(num / 7) + num % 7;
}
	 */
	
	
}
