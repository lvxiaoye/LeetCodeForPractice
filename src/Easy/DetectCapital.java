/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
package Easy;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("asdfgjk"));
		System.out.println(detectCapitalUse("Fuckyou"));
		System.out.println(detectCapitalUse("UsLLL"));
		System.out.println(detectCapitalUse("i987dddd"));

	}
	

    public static boolean detectCapitalUse(String word) {   
    	if(word == null){
    		return false;
    	}
    	char[] c = word.toCharArray();
    	if(word.length()==1){
    		if((c[0] >=65 & c[0]<=90) || (97<=c[0] & c[0]<=122)){
    			return true;
    		}
    	}else {if(97<=c[0] & c[0]<=122){
        	for(int i=1;i<word.length();i++){
        		if(word.charAt(i)<97 || word.charAt(i)>122){
        			return false;
        		}
        	}    	
        }else if(c[0] >=65 & c[0]<=90){
        	if(c[1] >=65 & c[1]<=90){
        		for(int i=2;i<word.length();i++){
        			if(c[i] < 65 || c[i] > 90){
        				return false;
        			}
        		}
        	}else if(97<=c[1] & c[1]<=122){
        		for(int i=2;i<word.length();i++){
        			if(c[i] <97 || c[i]>122){
        				return false;
        			}
        		}
        	}
        }else if(c[0]<65 || (c[0]>90 & c[0]<97) || c[0]>122){
        	return false;
        }
    	}
        return true;
    }
    
    /** java one-line code
     * public boolean detectCapitalUse(String word) {
    return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
}
     */
}
