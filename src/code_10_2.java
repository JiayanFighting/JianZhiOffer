public class code_10_2 {
    public static void main(String[] args){
        System.out.println(numWays(2));
    }

    public static int numWays(int n) {
        if (n <= 1) return 1;
        int last1 = 1,last2 = 1;//last1 = dp[i-1] last2 = dp[i-2]
        int ret = last1+last2;
        for (int i = 2;i<=n;i++){
            ret = last1+last2;
            if (ret >= 1000000007) ret = ret-1000000007;
            last2 = last1;
            last1 = ret;
        }
        return ret;
    }

    public static int numWays2(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
            if (dp[i] >= 1000000007) dp[i] = dp[i]-1000000007;
        }
        return dp[n-1];
    }
}
