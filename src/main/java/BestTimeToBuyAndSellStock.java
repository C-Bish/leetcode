public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);

        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int diff = prices[i] - buyPrice;
                if (diff > profit) {
                    profit = diff;
                }
            } else {
                buyPrice = prices[i];
            }
        }

        return profit;
    }
}