import java.util.HashMap;

public class code_42 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    // 动态规划
    // dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0] , last = nums[0] , now = nums[0];
        //以nums[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
        for (int i = 1;i<nums.length;i++){
            now = Math.max(last + nums[i],nums[i]);
            max = Math.max(now,max);
            last = now;
        }
        return max;
    }

    // 动态规划
    // dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
    public static int maxSubArray2(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        int[] dp = new int[nums.length];//以nums[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
        dp[0] = nums[0];
        for (int i = 1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
