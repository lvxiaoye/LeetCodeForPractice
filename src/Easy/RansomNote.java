/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
package Easy;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa";
		String magazine = "ab";
		System.out.println(canConstruct(ransomNote, magazine));

	}

    public static boolean canConstruct(String ransomNote, String magazine) {
    	if(ransomNote.equals("") & magazine.equals("")){
    		return true;
    	}else if(magazine.equals("")){
    		return false;
    	}else if(ransomNote.equals("")){
    		return true;
    	}
    	int i=0;
    	int j=0;
    	char[] r = ransomNote.toCharArray();
    	char[] m = magazine.toCharArray();
        while(i<ransomNote.length()){
        	for(j=0;j<magazine.length();j++){
        		if(r[i] == m[j]){
        			if(m[j] != 0){
        				i++;
        				m[j] = 0;
        				break;
        			}
        		}
        		
        	}
        	if(j>=magazine.length() && i !=ransomNote.length()){
        		return false;
        	}
        }
        return true;
    }
    /*
     * public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
	 public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magM = new HashMap<>();
        for (char c:magazine.toCharArray()){
            int newCount = magM.getOrDefault(c, 0)+1;
            magM.put(c, newCount);
        }
        for (char c:ransomNote.toCharArray()){
            int newCount = magM.getOrDefault(c,0)-1;
            if (newCount<0)
                return false;
            magM.put(c, newCount);
        }
        return true;
    }
     */
}
