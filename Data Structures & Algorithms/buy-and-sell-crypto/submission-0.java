class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int min = prices[0];
        for(int x : prices)
        {
            if(x < min)
            {
                min = x;
            }
            int currprofit = x - min;
            if(currprofit > profit)
            {
                profit = currprofit;
            }
        }
        return profit;
        
    }
}
