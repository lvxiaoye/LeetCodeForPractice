/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
package Easy;


public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));
	}
    /*time limit exceed
     * public static boolean isPalindrome(String s) {
    	if(s.length()==0||s==null){
    		return true;
    	}
    	String[] tokens = s.toLowerCase().split("\\W");
    	String newS ="";

    	for(String token:tokens){
    		newS+=token;
    	}
       // System.out.println(newS);
        for(int i=0,j=newS.length()-1;i<newS.length()/2 & j>=(newS.length()+1)/2;i++,j--){      
        	if(newS.charAt(i)!=newS.charAt(j)){
        		return false;
        	}
        }
    	return true;
    }*/
	public static boolean isPalindrome(String s) {
    	if(s.length()==0||s==null){
    		return true;
    	}
    	int i=0,j=s.length()-1;
    	while(i<j){
    		char c1=s.charAt(i);
    		char c2=s.charAt(j);
    		if(!(Character.isLetterOrDigit(c1))){
    			//System.out.println(i+" " +c1+" "+j+" "+c2);
    			i++;
    		}else if(!(Character.isLetterOrDigit(c2))){
    			//System.out.println(i+" " +c1+" "+j+" "+c2);
    			j--;
    		}else{
    			if (Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
    				return false;
    			}
    			i++;
    			j--;
    		}
    	}

    	return true;
    }

}
