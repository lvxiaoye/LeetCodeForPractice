package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =15;
		FizzBuzz fb = new FizzBuzz();
		List<String> result = fb.fizzBuzz(n);
		for(String s : result){
			System.out.println(s);
		}

	}
	
    public List<String> fizzBuzz(int n) {
    	List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	if((i % 3 == 0) & (i % 5 ==0)){
        		result.add("FizzBuzz");
        	}else if(i % 3 == 0){
        		result.add("Fizz");
        	}else if(i%5 == 0){
        		result.add("Buzz");
        	}else 
        		result.add(String.valueOf(i));
        }
        return result;
    }

    /*not using %
    
    public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        } 
        return ret;
    }
}
     */
    
}
