class Solution {
    public int maxProfit(int[] prices) {
        int cur = 0;
        int next = 1;
        int profit = 0;

        while(next < prices.length){
            if(prices[next] > prices[cur]){
                profit += (prices[next] - prices[cur]);
            }

            cur++;
            next++;
        }

        return profit;
    }
}