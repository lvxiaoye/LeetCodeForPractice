/**
 * Given a string, find the length of the longest substring without repeating characters.
	Examples:
    Given "abcabcbb", the answer is "abc", which the length is 3.
	Given "bbbbb", the answer is "b", with the length of 1.
 	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "dvdf";
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		int result1 = l.lengthOfLongestSubstring(test1);
		System.out.println(result1);

	}
  /*  public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        char[] st = s.toCharArray();
        String re = "";
        ArrayList<Integer> length = new ArrayList<Integer>();
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        int i=0;int k =0;
        //re[k] = String.valueOf(st[i-1]);
        for(k = 0;k<st.length;k++){
        	labelB:
        	for(i=k;i<st.length;i++){            	   		       			
       			//re[k] = String.valueOf(st[i-1]); 
        		char[] cc = re.toCharArray();
        		labelA:
      		   	for(int j=0;j<re.length();j++){  		   		
      	  			if(cc[j] == st[i]){
      	  				length.add(re.length());
      	  				re = "";
      	  				break labelB;
   	    			}
   	    		}
       	    	re+=st[i];
       	    	if(i==st.length-1){
       	    		length.add(re.length());
       	    	}
      	    }
        }
        int result = 0;
        for(int l:length){       	
        	result=result>l?result:l;
        }
        return result;
    }*/
	public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
	
	public class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        int[] index = new int[128]; // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            i = Math.max(index[s.charAt(j)], i);
	            ans = Math.max(ans, j - i + 1);
	            index[s.charAt(j)] = j + 1;
	        }
	        return ans;
	    }
	}

}
