/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7。
 */
package Easy;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abccccdd";
		String s1 = "abcccdddddsii";
		String s2 = "";
		String s3 = "bb";
		System.out.println(longestPalindrome(s));
	}
    public static int longestPalindrome(String s) {
    	int sum =0;
        if(s == null || s.length() == 0){
        	return 0;
        }
        char[] attr = new char[58];
        for(int i=0;i<s.length();i++){
        	attr[s.charAt(i)-'A'] +=1;
        }
        for(int i=0;i<58;i++){
        	if(attr[i] %2 == 1){
        		sum+=(attr[i]-1);
        	}else if(attr[i] !=0){
        		sum +=(attr[i]);
        	}
        }
        for(int i=0;i<58;i++){
        	if(attr[i]%2 == 1){
        		return sum+=1;
        	}
        }
        
        return sum;
        
    }
    /*HashSet思路
     * public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}
     */
    /*
     * public int longestPalindrome(String s) {
    int[] lowercase = new int[26];
    int[] uppercase = new int[26];
    int res = 0;
    for (int i = 0; i < s.length(); i++){
        char temp = s.charAt(i);
        if (temp >= 97) lowercase[temp-'a']++;
        else uppercase[temp-'A']++;
    }
    for (int i = 0; i < 26; i++){
        res+=(lowercase[i]/2)*2;
        res+=(uppercase[i]/2)*2;
    }
    return res == s.length() ? res : res+1;
        
}
     */

}
