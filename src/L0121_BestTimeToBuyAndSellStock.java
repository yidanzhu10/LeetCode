public class L0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int startPrice = prices[0];
        int len = prices.length;
        int profit = 0;
        for(int i = 1; i < len; i ++){
            if(prices[i] < startPrice){
                startPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - startPrice);
        }
        return profit;
    }
}
