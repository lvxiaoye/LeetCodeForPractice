/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? (将26改成256）How would you adapt your solution to such case?
 */
package Easy;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "anagram";
		String s2 = "agrmana";
		String s3 = "cat";
		String s4 = "rat";
		String s5 = null;
		String s6 = null;
		System.out.println(isAnagram(s5,s2));
	}
    public static boolean isAnagram(String s, String t) {
    	if(s == null & t == null){
    		return true;
    	}else if(s == null || t == null){
    		return false;
    	}
    	char[] attr1 = new char[26];
    	for(int i=0;i<26;i++){
    		attr1[i] = 0;
    	}
    	for(int i=0;i<s.length();i++){
    		attr1[s.charAt(i)-'a'] += 1;
    	}
    	for(int i=0;i<t.length();i++){
    		attr1[t.charAt(i)-'a'] -=1;
    	}
    	for(int i=0;i<26;i++){
    		if(attr1[i] != 0){
    			return false;
    		}
    	}
    	return true;
        
    }

}
