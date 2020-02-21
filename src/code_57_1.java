public class code_57_1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        int[] ret = twoSum(nums,6);
        for (int num:ret){
            System.out.println(num);
        }
    }

    //Hashset
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if (nums.length <= 1) return ret;
        int left = 0, right = nums.length-1;
        while (left < right){
            if (nums[left] + nums[right] == target){
                ret[0] = nums[left];
                ret[1] = nums[right];
                return ret;
            }else if (nums[left] + nums[right] < target){
                left++;
            }else {
                right--;
            }
        }
        return ret;
    }
}
