import java.util.HashSet;

public class code_56_1 {
    public static void main(String[] args){
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] ret = singleNumbers(nums);
        for (int num:ret){
            System.out.println(num);
        }

    }

    //Hashset
    public static int[] singleNumbers(int[] nums) {
        if (nums.length <= 2) return nums;
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            // 因为其他只会出现两次，则包含add & remove 最后不存在set中
            if (set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        int[] ret = new int[2];
        Object[] ret2 = set.toArray();
        for (int i = 0;i< ret2.length && i<2;i++){
            ret[i] = (int) ret2[i];
        }
        return ret;
    }
}
