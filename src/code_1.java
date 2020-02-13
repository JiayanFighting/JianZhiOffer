import java.util.HashMap;

public class code_1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,1};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        if (nums.length <= 1) return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            int time = map.getOrDefault(num,0);
            if (time >= 1) return num;
            map.put(num,time+1);
        }
        return -1;
    }
}
