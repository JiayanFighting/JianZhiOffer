import java.util.HashMap;

public class code_13 {
    public static void main(String[] args){
        System.out.println(movingCount(38,15,9));
    }

    // 动态规划
    public static int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) return 0;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        int total = 1;
        for (int i = 1; i<m;i++){
            if (getSum(i) <= k){
                dp[i][0] =  dp[i-1][0];
                if (dp[i][0]) total ++;
            }
        }
        for (int j = 1; j<n;j++){
            if (getSum(j) <= k){
                dp[0][j] =  dp[0][j-1];
                if (dp[0][j]) total ++;
            }
        }
        for (int i = 1;i<m;i++){
            for (int j = 1;j<n;j++){
                // 行坐标和列坐标的数位之和大于k的格子 false
                if (getSum(i) + getSum(j) <= k){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    if (dp[i][j]) total++;
                }
            }
        }
        return total;
    }

    public static int getSum(int x){
        int ret = 0;
        while (x > 0){
            ret += x % 10;
            x = x / 10;
        }
        return ret;
    }
}
