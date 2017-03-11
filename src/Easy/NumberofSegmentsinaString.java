/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
 */
package Easy;

import java.util.StringTokenizer;

public class NumberofSegmentsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSegments("Hello, my name is John"));
	}

    public static int countSegments(String s) {
    	int count =0;
    	if(s==null ||s.length() == 0){
    		return count;
    	}
        String[] ss = s.trim().split("\\s+");
        
        StringTokenizer st = new StringTokenizer(s);
        
    	//return ss.length;
        return st.countTokens();
    }
    /*
     * public int countSegments(String s) {
    int res=0;
    for(int i=0; i<s.length(); i++)
        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
            res++;        
    return res;
}

     */
    /*
     * public int countSegments(String s) {
    String trimmed = s.trim();
    if (trimmed.length() == 0) return 0;
    else return trimmed.split("\\s+").length;
}
     */
}
