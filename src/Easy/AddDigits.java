/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

Hint:


A naive implementation of the above process is trivial. Could you come up with other methods?
What are all the possible results?
How do they occur, periodically or randomly?
https://en.wikipedia.org/wiki/Digital_root

 */
package Easy;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 67;
		System.out.println(addDigits(num));

	}
    public static int addDigits(int num) {     
        if(num==0){
        	return num;
        }else return 1+(num-1)%9;
        
    }
	
	

}
