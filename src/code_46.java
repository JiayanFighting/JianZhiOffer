import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class code_46 {
    public static void main(String[] args){
        System.out.println(translateNum(12258));
    }

    // 动态规划
    public static int translateNum(int num) {
        if (num <= 9 ) return 1;
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        // 0 - 25
        for (int i = 2;i<=s.length();i++){
            int x = s.charAt(i-1)-48;
            if (x >= 6 && x <= 9){// 6 7 8 9
                if (s.charAt(i-2)-48 == 1){// 16 17 18 19
                    dp[i] = dp[i-1] + dp[i-2];
                }else{ //06 07 08 09 26 27 28 29 36 ...
                    dp[i] = dp[i-1];
                }
            }else {// 0 1 2 3 4 5 6
                if (s.charAt(i-2)-48 == 1 || s.charAt(i-2)-48 == 2){// 10
                    dp[i] = dp[i-1] + dp[i-2];
                }else{// 00 01 ... 06  30 31 ... 36 40 ...
                    dp[i] = dp[i-1];
                }
            }
        }

        return dp[s.length()];
    }
}
