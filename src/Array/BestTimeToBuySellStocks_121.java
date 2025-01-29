package Array;

public class BestTimeToBuySellStocks_121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static  int maxProfit(int[] prices) {
        int lowestbought = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestbought) {
                lowestbought = prices[i];
            }

            profit = prices[i] - lowestbought;
            if (overallProfit < profit) {
                overallProfit = profit;
            }
        }
        return overallProfit;

    }
    
}
