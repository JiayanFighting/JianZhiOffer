import java.util.HashMap;

public class code_53 {
    public static void main(String[] args){
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0 , right = nums.length-1;
        int last = nums.length-1;
        while (left<=right){
            int mid = (left + right) /2;
            if (nums[mid] == mid){
                left = mid +1;
            }else{
                last = mid;
                right = mid-1;
            }
        }
        return last;
    }
}
