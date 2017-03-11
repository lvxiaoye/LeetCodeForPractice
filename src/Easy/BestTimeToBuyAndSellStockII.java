/**
 * Say you have an array for which
 *  the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. 
You may complete as many transactions as you like (ie, buy one and sell one share of 
the stock multiple times). However, you may not engage in multiple transactions at the
 same time (ie, you must sell the stock before you buy again).
 */

package Easy;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {200,80,100,3,5};
		System.out.println(maxProfit(prices));

	}
    public static int maxProfit(int[] prices) {
     	if(prices.length == 0 || prices == null){
    		return 0;
    	}
    	int sum = 0;
    	for(int i=1;i<prices.length;i++){
    		if(prices[i]>prices[i-1]){
    			sum+=(prices[i]-prices[i-1]);
    		}
    	}
    	return sum;       
    }
    
    /*if we don't allow to buy and sell on the same day, the above algorithm will not be applicable
     * public int maxProfit(int[] prices) {
    int profit = 0, i = 0;
    while (i < prices.length) {
        // find next local minimum
        while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
        int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
        // find next local maximum
        while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
        profit += i < prices.length ? prices[i++] - min : 0;
    }
    return profit;
}
     */

}
