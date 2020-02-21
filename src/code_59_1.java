public class code_59_1 {
    public static void main(String[] args){
        int[] nums = {1,-1};
        int[] ret = maxSlidingWindow(nums,1);
        for (int num :ret){
            System.out.println(num);
        }
    }

    // 所有滑动窗口的最大值
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k <0 || nums.length == 0) return new int[0];
        // 滑动窗口的个数 nums.length+1 - k
        int[] dp = new int[nums.length+1-k];
        int max = nums[0];
        for (int i = 1;i<k;i++){
            max = Math.max(max,nums[i]);
        }
        dp[0] = max;
        for (int i = k;i<nums.length;i++){
            int index = i-k+1;
            if (nums[i] > dp[index-1]){
                dp[index] = nums[i];
            }else {
                dp[index] = dp[index-1];
            }
        }
        return dp;
    }
}
