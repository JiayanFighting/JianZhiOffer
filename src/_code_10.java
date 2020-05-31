public class _code_10 {
    public static void main(String[] args) {

        System.out.print(JumpFloorII(4));

    }

    public static int JumpFloorII(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3;i<=n;i++){
            for (int j = 1;j<=i;j++){
                dp[i] += dp[i-j];
            }
        }
        return dp[n];
    }
}
