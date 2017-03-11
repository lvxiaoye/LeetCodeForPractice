/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */
package Easy;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));
		System.out.println(reverseVowels("aA"));
	}
	
    public static String reverseVowels(String s) {
    	if(s==null||s.length() == 0){
    		return new String("");
    	}
    	char[] array = s.toCharArray();
        int start=0,end=s.length()-1;
        String vowels ="aeiouAEIOU";
        while(start<end){
        	if(isVowels(s.charAt(start)) & isVowels(s.charAt(end))){
        		char temp;
        		temp = s.charAt(end);
        		array[end]=array[start];
        		array[start]=temp;
        		start++;
        		end--;
        	}else if(!isVowels(s.charAt(start))){
        		start++;
        	}
        	if(!isVowels(s.charAt(end))){
        		end--;
        	}
        }
        return new String(array);
    }
    public static boolean isVowels(char i){
    	switch(i){
    	case('a'):
    		return true;
    	case('e'):
    		return true;
    	case('i'):
    		return true;
    	case('o'):
    		return true;
    	case('u'):
    		return true;
    	case('A'):
    		return true;
    	case('E'):
    		return true;
    	case('I'):
    		return true;
    	case('O'):
    		return true;
    	case('U'):
    		return true;
    	default:
    		return false;
    	}
    }
    /**
     * 
     */

}
