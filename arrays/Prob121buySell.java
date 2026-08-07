package arrays;

class Prob121 {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for(int i =0;i<prices.length;i++){
        //     for(int j = i+1;j<prices.length;j++){
        //         if(prices[j]>prices[i]){
        //             int profit = prices[j] - prices[i];
        //             maxProfit = Math.max(profit, maxProfit);
        //         }
        //     }
        // }
        // return maxProfit;

        //approach 2
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > lowestPrice) {
                int profit = prices[i] - lowestPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }
        return maxProfit;
    }
}
public class Prob121buySell {
    public static void main(String[] args) {
        Prob121 pr = new Prob121();
        int[] prices = {7,1,5,3,6,4};
        int result = pr.maxProfit(prices);
        System.out.println(result);
    }
}
