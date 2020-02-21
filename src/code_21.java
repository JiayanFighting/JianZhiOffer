import java.util.HashMap;

public class code_21 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,1};
        int[] ret = exchange(nums);
        for (int num : ret){
            System.out.print(num+" ");
        }
    }

    public static int[] exchange(int[] nums) {
        if (nums.length <= 1) return nums;
        int left = 0, right = nums.length-1;
        while (left<right){
            while (left < nums.length-1 && left < right && nums[left] %2 == 0){
                left++;
            }
            while (right >= 0 && left < right && nums[right] % 2 == 1){
                right--;
            }
            //exchange
            if (left < nums.length-1 && right >= 0 && left < right){
                int x = nums[left];
                nums[left] = nums[right];
                nums[right] = x;
            }
        }
        return nums;
    }
}
