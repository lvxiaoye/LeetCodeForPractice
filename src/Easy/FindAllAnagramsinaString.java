/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> result = findAnagrams("asdfjkllasdflfdsa", "asdf");
		System.out.println(isAnagrams("dsaf", "asdf"));
		for(int i:result){
			System.out.print(i+" ");
		}

	}
/* time limit exceed  
 *  public static List<Integer> findAnagrams(String s, String p) {
    	List<Integer> l = new ArrayList<Integer>();
        if(s==null){
        	return null;
        }
        if(s.length()==0){
            return l;
        }
        for(int i=0;i<=s.length()-p.length();i++){
        	if( isAnagrams(s.substring(i,i+p.length()),p)){
        		l.add(i);
        	}
        }
        return l;
    }
	private static boolean isAnagrams(String substring, String p) {
		// TODO Auto-generated method stub
		if(substring.length()!=p.length()){
			return false;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<substring.length();i++){
			int count=1;
			char c = substring.charAt(i);
			if(map.containsKey(c)){
				map.replace(c,count+1);
			}else
				map.put(c,count);
		}
		for(int i=0;i<p.length();i++){
			char c = p.charAt(i);
			if(!map.containsKey(c)){
				return false;
			}else{
				if(map.get(c).intValue()==1){
					map.remove(c);
				}else
					map.put(c, map.get(c).intValue()-1);
			}
		}
		if(map.isEmpty()){
			return true;
		}
		return false;
	}*/
	
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p == null || s == null || s.length() < p.length()) return res;
        int m = s.length(), n = p.length();
        for (int i = 0; i < m-n+1; i++) {
            String cur = s.substring(i, i+n);
            if (isAnagrams(cur, p)) res.add(i);
        }
        return res;
    }
    public static boolean isAnagrams(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) return false;
        int[] dict = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            dict[ch-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            dict[ch-'a']--;
            if (dict[ch-'a'] < 0) return false;
        }
        return true;
    }

	 
	/*
	 * Same idea from a fantastic sliding window template, please refer:
https://discuss.leetcode.com/topic/30941/here-is-a-10-line-template-that-can-solve-most-substring-problems

Time Complexity will be O(n) because the "start" and "end" points will only move from left to right once.

public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
    int[] hash = new int[256]; //character hash
    //record each character in p to hash
    for (char c : p.toCharArray()) {
        hash[c]++;
    }
    //two points, initialize count to p's length
    int left = 0, right = 0, count = p.length();
    while (right < s.length()) {
        //move right everytime, if the character exists in p's hash, decrease the count
        //current hash value >= 1 means the character is existing in p
        if (hash[s.charAt(right++)]-- >= 1) count--; 
        
        //when the count is down to 0, means we found the right anagram
        //then add window's left to result list
        if (count == 0) list.add(left);
    
        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
        //++ to reset the hash because we kicked out the left
        //only increase the count if the character is in p
        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
    }
    return list;
}
	 */
}

