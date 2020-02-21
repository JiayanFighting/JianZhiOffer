import sun.nio.cs.ext.MacArabic;

public class code_47 {
    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxValue(grid));
    }

    //动态规划
    public static int maxValue(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m]; // dp[i][j] 到 i j 的最大的sum
        dp[0][0] = grid[0][0];
        for (int i = 1;i<n;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for (int j = 1; j<m;j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for (int i = 1;i<n;i++){
            for (int j =1;j<m;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }

    // 回溯  超时
    public static int maxValue2(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        return helper(0,0,0,grid);
    }

    public static int helper(int x, int y, int sum,int[][] grid){
        sum += grid[x][y];
        if (x == grid.length-1 && y == grid[x].length-1) return sum;
        if (x+1 < grid.length){
            sum = Math.max(helper(x+1,y,sum,grid),sum);
        }
        if (y+1 < grid[x].length){
            sum = Math.max(sum, helper(x,y+1,sum,grid));
        }
        return sum;
    }
}
