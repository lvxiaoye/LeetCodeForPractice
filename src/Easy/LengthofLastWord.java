/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 */
package Easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub';
		System.out.println(lengthOfLastWord("Hello World "));

	}
    public static int lengthOfLastWord(String s) {
    	if(s==null||s.length()==0){
    		return 0;
    	}else{
        	String[] ss = s.trim().split(" ");
        	String target = ss[ss.length-1];
        	return target.length();
        }
    	
    }
    /**
     * public int lengthOfLastWord(String s) {
    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
}
     */
    

}
