class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int buy=0;buy<prices.length;buy++){
            for(int sell=buy+1;sell<prices.length;sell++){
                maxProfit=Math.max(maxProfit, prices[sell]-prices[buy]);
            }
        }
        return maxProfit;
    }
}
