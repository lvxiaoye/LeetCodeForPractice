/**
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space
 */
package Easy;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abbad", "dog cat cat dog fish"));
	}

    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        String[] st = str.trim().split(" ");
        if(st.length!=pattern.length()){
        	return false;
        }
        for(int i=0;i<pattern.length();i++){
        char c = pattern.charAt(i);
        	if(map.containsKey(c)){
        		if(!map.get(c).equals(st[i])){
        			return false;
        		}
        	}else if(map.containsValue(st[i])){
        		return false;
        	}else{
        		map.put(c, st[i]);
        		System.out.println(c+" "+st[i]);
        	}
        }
        return true;
    }
    /**
     * public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (words.length != pattern.length())
        return false;
    Map index = new HashMap();
    for (Integer i=0; i<words.length; ++i)
        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
            return false;
    return true;
}
I go through the pattern letters and words in parallel and compare the indexes where they last appeared.

Edit 1: Originally I compared the first indexes where they appeared, using putIfAbsent instead of put. That was based on mathsam's solution for the old Isomorphic Strings problem. But then czonzhu's answer below made me realize that put works as well and why.

Edit 2: Switched from

    for (int i=0; i<words.length; ++i)
        if (!Objects.equals(index.put(pattern.charAt(i), i),
                            index.put(words[i], i)))
            return false;
to the current version with i being an Integer object, which allows to compare with just != because there's no autoboxing-same-value-to-different-objects-problem anymore. Thanks to lap_218 for somewhat pointing that out in the comments.
     */
}
