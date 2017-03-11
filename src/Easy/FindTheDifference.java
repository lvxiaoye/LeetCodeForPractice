package Easy;

public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));
	}
    public static char findTheDifference(String s, String t) {
    	if(s == null){
    		return t.charAt(0);
    	}
        int ans =0;
        int i=0;
    	for(i=0;i<s.length();i++){
        	ans ^= (s.charAt(i)^t.charAt(i));
        }
    	ans ^= t.charAt(i);
        return (char)ans;
    }

    /**
     * public char findTheDifference(String s, String t) {
	int n = t.length();
	char c = t.charAt(n - 1);
	for (int i = 0; i < n - 1; ++i) {
		c ^= s.charAt(i);
		c ^= t.charAt(i);
	}
	return c;
}
     */
}
