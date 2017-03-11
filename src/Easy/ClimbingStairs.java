/**
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.
 */
package Easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));
	}
//time limit exceed:
/*    public static int climbStairs(int n) {
        int count =1 ;
        if(n==1){
        	return count;
        }
        if(n==2){
        	return 2;
        }
        return (climbStairs(n-1)+climbStairs(n-2));
        
       
    }*/
	public static int climbStairs(int n){
        if(n==1){
        	return 1;
        }
        if(n==2){
        	return 2;
        }
        int one_step_before = 2;
        int two_step_before = 1;
        int all_ways = 0;
        for(int i=3;i<=n;i++){
        	all_ways = one_step_before+two_step_before;
        	two_step_before=one_step_before;
        	one_step_before=all_ways;
        }
        return all_ways;
	}
    
}
