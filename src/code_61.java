public class code_61 {
    public static void main(String[] args){
        int[] nums = {0,12,11,11,0};
        System.out.println(isStraight(nums));
    }

    public static boolean isStraight(int[] nums) {
        int[] rec = new int[14];
        for (int num : nums){
            rec[num] ++;
            if (num != 0 && rec[num] >= 2){
                return false;
            }
        }
        int num = 0;
        for (int i = 1; i<=13;i++){
            if (rec[i] == 0){ // 没有这张牌
                if (num == 0){ // 还没开始
                    continue;
                }else {//已经开始 但是没有这张牌
                    if (rec[0] > 0) {// 还剩大小王
                        rec[0]--;//用掉
                        num++;
                    }else {
                        return false;
                    }
                }
            }else{//有这张牌
                num++;
            }
            if (num == 5) return true;
        }
        return true;
    }
}
