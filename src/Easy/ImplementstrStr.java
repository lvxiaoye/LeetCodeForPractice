/**
 * Implement strStr().

   Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
package Easy;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello world,man", "world"));

	}
    public static int strStr(String haystack, String needle) {
    	//System.out.println(haystack.length()+" "+needle.length());
      for(int i=0;i<=haystack.length()-needle.length();i++){
    	  if(haystack.substring(i,i+needle.length()).equals(needle)){
       			return i;
   		  }
      }
      return -1;
        
    }

}
