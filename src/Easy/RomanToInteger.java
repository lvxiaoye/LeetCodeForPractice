/**
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */
package Easy;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IX";
		System.out.println(romanToInt(s));

	}
    public static int romanToInt(String s) {
    	if(s == null || s.length() ==0){
    		return -1;
    	}
    	int[] intArray = new int[s.length()];
    	for(int i=0;i<s.length();i++){
    		intArray[i] = switchToInt(s.charAt(i));
    	}
    	int sum = 0;
    	int i=0;
    	for(i=0;i<s.length()-1;i++){
    		if(intArray[i] == 1 & (intArray[i+1] == 5 || intArray[i+1] ==10)){
    			sum -=1;
    		}else if(intArray[i] == 10 & (intArray[i+1] == 50 || intArray[i+1] ==100)){
    			sum -= 10;
    		}else if(intArray[i] == 100 & (intArray[i+1] == 500 || intArray[i+1] ==1000)){
    			sum-=100;
    		}else
    			sum+=intArray[i];
    	}
    	sum+=intArray[i];
        return sum;
    }
    public static int switchToInt(char c){
    	int result = 0;
    	switch(c){
    	case('I'): 
    		result= 1;
    		break;
    	case('V'):
    		result =5;
    		break;
    	case('X'):
    		result = 10;
    	break;
    	case('L'):
    		result = 50;
    	break;
    	case('C'):
    		result = 100;
    		break;
    	case('D'):
    		result = 500;
    		break;
    	case('M'):
    		result = 1000;
    		break;
    	}
		return result;
    	
    }
    /**
     *  public int romanToInt(String s) {
    int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch (s.charAt(i)){
            case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1])
            sum-=nums[i];
        else
            sum+=nums[i];
    }
    return sum+nums[nums.length-1];
}
     */

}
