/**Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "leetcode";
		String s2 = "loveleetcode";
		String s3 = "";
		String s4 = "asdfghjkl";
		String s5 ="eeeeeeeeeeeeb";
		String s6 = "eeeeeeeeeeeee";
		System.out.print(firstUniqChar(s4));

	}

	public static int firstUniqChar(String s){
    	if(s == null){
    		return -1;
    	}
		HashMap<Integer,Character> map = new HashMap<>();
		char[] cs = s.toCharArray();
		for(int i=0;i<s.length();i++){
			map.put(i, cs[i]);
		}
		for(int i=0;i<s.length();i++){
			map.remove(i, cs[i]);
			if(map.containsValue(cs[i])){
				map.put(i, cs[i]);
				continue;
			}else
				return i;
		}
		return -1;
	}
	/*将26改成256就可以适用于所有的ASCII码， 这个只需要O(n)的计算量，运用一个额外的数组来计算相应字符的个数
	 * public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
	 */

}
