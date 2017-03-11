/**
 * We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.
 */
package Easy;

public class GuessNumberHigherorLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guessNumber(2));
	}

    public static int guessNumber(int n) {
    	if(n==1){
    		return n;
    	}
    	int end = n;
    	int start = 1;
    	int input = start+(end-start)/2;
    	while(guessGame.guess(input)!=0){
    	if(guessGame.guess(input)==1){
    		start = input;
    		input = input+1;
    	}else if(guessGame.guess(input)==-1){
    	    end = input;
    		input = start+(end-start)/2;
    	}
    	}
    	return input;
    	
    }
    	
    
    public static class guessGame{
    	static int n = 2;
    	static int guess(int num){
    		if(num<n){
    			return 1;
    		}else if(num ==n){
    			return 0;
    		}else 
    			return -1;
    	}
    }
    /**
     * public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l < r) {
            int m = (l & r) + ((l ^ r) >> 1);//==l+(r-l)/2
            if (guess(m) == 0) return m;
            else if (guess(m) == 1) l = m + 1;
            else r = m - 1;
        }
        return l;
    }
}
     */
	

}
