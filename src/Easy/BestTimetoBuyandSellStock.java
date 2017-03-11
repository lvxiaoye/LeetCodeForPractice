/**Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
 */
package Easy;


public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		int[] prices2={7,6,4,3,1};
		System.out.println(maxProfit(prices2));

	}

    public static int maxProfit(int[] prices) {
    	if(prices.length == 0 || prices ==null){
    		return 0;
    	}
    	int curMax=0;
    	int maxSoFar =0;
    	for(int i=1;i<prices.length;i++){
    		curMax = Math.max(0, curMax+=prices[i]-prices[i-1]);
    		maxSoFar = Math.max(curMax, maxSoFar);
    	}
    	return maxSoFar;

    	
        
    }
}
