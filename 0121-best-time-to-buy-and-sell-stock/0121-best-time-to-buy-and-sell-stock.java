class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buying_price = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] <= buying_price ){
                buying_price = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i]-buying_price);
        }
        return profit;
    }
}