/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
package Easy;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("abab"));

	}
	// time limit exceed;
/*    public static boolean repeatedSubstringPattern(String s) {
    	if(s == null ||s.length() ==0){
    		return false;
    	}
        String subs ="";
        int i=0;
        int j=0;
        labelA:
        for(i=0;i<s.length()/2+1;i++){        	
        	subs+=s.charAt(i);
        	System.out.println(subs);
        	for(j=i+1;j<=s.length()-subs.length();j+=subs.length())	{
        		if(!s.substring(j, j+subs.length()).equals(subs)){
        			System.out.println(i+" "+j+" "+s.substring(j, j+subs.length()));
        			continue labelA;
        		}
        		System.out.println(i+" "+j+" "+s.substring(j, j+subs.length()));
            	if(j == s.length()-subs.length() & s.substring(j, s.length()).equals(subs)){
            		return true;
            	}
        	} 	
        }
        return false;
    }*/
	public static boolean repeatedSubstringPattern(String str) {
		int l = str.length();
		for(int i=l/2;i>=1;i--) {
			if(l%i==0) {
				int m = l/i;
				String subS = str.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<m;j++) {
					sb.append(subS);
				}
				if(sb.toString().equals(str)) return true;
			}
		}
		return false;
	}
	/*http://jakeboxer.com/blog/2009/12/13/the-knuth-morris-pratt-algorithm-in-my-own-words/
	 * public boolean repeatedSubstringPattern(String str) {
	        //This is the kmp issue
	        int[] prefix = kmp(str);
	        int len = prefix[str.length()-1];
	        int n = str.length();
	        return (len > 0 && n%(n-len) == 0);
	    }
	    private int[] kmp(String s){
	        int len = s.length();
	        int[] res = new int[len];
	        char[] ch = s.toCharArray();
	        int i = 0, j = 1;
	        res[0] = 0;
	        while(i < ch.length && j < ch.length){
	            if(ch[j] == ch[i]){
	                res[j] = i+1;
	                i++;
	                j++;
	            }else{
	                if(i == 0){
	                    res[j] = 0;
	                    j++;
	                }else{
	                    i = res[i-1];
	                }
	            }
	        }
	        return res;
	    }
	 */

}
