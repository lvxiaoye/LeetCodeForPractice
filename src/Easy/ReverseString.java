package Easy;

public class ReverseString {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String s = "hello";
		System.out.println(reverseString(s));
		reverseString(s);
	}
	
/*    public static String reverseString(String s) {
    	if(s == null){
    		return null;
    	}
    	int i =0;
    	String result = "";
    	while(i<s.length()){  	
    		result += (s.charAt((s.length()-1-i)));
    		i++;
    	}
       	return result;   
    }*/
	public static String reverseString(String s){
		char[] word = s.toCharArray();
		int i = 0;
		int j=s.length()-1;
		char temp;
		while(i<j){
			temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}

}
