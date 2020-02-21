import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class code_43 {
    public static void main(String[] args){
        System.out.println(nthUglyNumber(10));
    }

    // 找出第 n 个丑数
    //丑数就是只包含质因数 2, 3, 5 的正整数。
    public static int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0,i3=0,i5=0;
        for (int i = 1;i<n;i++){
            int min = Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            dp[i] = min;
            if (dp[i2]*2 == min) i2 ++;
            if (dp[i3]*3 == min) i3 ++;
            if (dp[i5]*5 == min) i5 ++;
        }
        return dp[n-1];
    }
}
