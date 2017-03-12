/**
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("ab", "aa"));
	}
    public static boolean isIsomorphic(String s, String t) {
    	Set<Character> cha = new HashSet<Character>();
        if((s==null & t==null)||(s.length()==0 & t.length()==0)){
        	return true;
        }
        if(s.equals(t)){
        	return true;
        }
        if(s.length()!=t.length()){
        	return false;
        }
        HashMap<Character,Character> helper = new HashMap<>();
        for(int i=0;i<s.length();i++){
        	char c1=s.charAt(i),c2=t.charAt(i);
        	if(helper.containsKey(c2)){
        		if(helper.get(c2)!= c1){
        			return false;
        		}else
        			continue;
        	}else{
        		if(cha.contains(c1)){
        			return false;
        		}else{
        		helper.put(c2, c1);
        		cha.add(c1);
        		}
        	}
        }
        return true;
    }
    /**
     * public boolean isIsomorphic(String sString, String tString) {

        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();

        int length = s.length;
        if(length != t.length) return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = s[i];
            char tc = t[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
    }
     */

}
