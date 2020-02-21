import java.util.HashMap;

public class code_10_1 {
    public static void main(String[] args){
        System.out.println(fib(1));
    }

    public static int fib(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        int last1 = 1,last2 = 1;//last1 = dp[i-1] last2 = dp[i-2]
        int ret = last1;
        for (int i = 2;i<n;i++){
            ret = last1+last2;
            if (ret >= 1000000007) ret = ret-1000000007;
            last2 = last1;
            last1 = ret;
        }
        return ret;
    }

    public static int fib2(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
            if (dp[i] >= 1000000007) dp[i] = dp[i]-1000000007;
        }
        return dp[n-1];
    }
}
