class Solution {
    public int maxProfit(int[] prices) {
        int before = 0;
        int after = 1;
        
        int maxProfit = 0;
        while (after < prices.length){
            if(prices[after] > prices[before]){
                maxProfit += (prices[after] - prices[before]);
            }
            
            after++;
            before++;
        }
        
        return maxProfit;
    }
}