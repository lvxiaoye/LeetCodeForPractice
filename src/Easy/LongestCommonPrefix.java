/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
package Easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"abcdef","abcd","abfd"};
		System.out.println(longestCommonPrefix(strs));
	}

    public static String longestCommonPrefix(String[] strs) {
    	if(strs==null||strs.length==0){
    		return "";
    	}
        for(String s:strs){
        	if(s==null||s.length()==0){
        		return "";
        	}
        }
        StringBuilder sb = new StringBuilder();
        int min = strs[0].length();
        for(int i=1;i<strs.length;i++){
        	min = min<strs[i].length()?min:strs[i].length();
        }
        System.out.println(min);
        for(int i=0;i<min;i++){
        	for(int j=1;j<strs.length;j++){
        		if(strs[0].charAt(i)!=strs[j].charAt(i)){
        			return sb.toString();
        		}
        	}
        	sb.append(strs[0].charAt(i));
        }
        return sb.toString();
        
    }
    /*
     * Sort the array first, and then you can simply compare the first and last elements in the sorted array.

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        return result.toString();
    }
     */
}
