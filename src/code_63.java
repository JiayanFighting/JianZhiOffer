import java.util.ArrayList;

public class code_63 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0],maxProfit = 0;
        for (int i = 1;i<prices.length;i++){
            if (prices[i] > min){
                maxProfit = Math.max(prices[i] - min,maxProfit);
            }else {
                min = prices[i];
            }
        }
        return maxProfit;
    }

    // 动态规划
    public int maxProfit2(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1;i<prices.length;i++){
            if (prices[i] > prices[i-1]){
                dp[i] = Math.max(dp[i-1] , prices[i] - min);
            }else {
                dp[i] = dp[i-1];
            }
            min = Math.min(min,prices[i]);
        }

        return dp[prices.length-1];
    }
}
