public class L1475_FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        search: for(int i = 0; i < prices.length; i ++) {
            for(int j = i + 1; j < prices.length; j ++) {
                if(prices[j] < prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    continue search;
                }
                else {
                    ans[i] = prices[i];
                }
            }
            ans[prices.length - 1] = prices[prices.length - 1];
        }
        return ans;
    }
}
