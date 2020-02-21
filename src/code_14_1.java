public class code_14_1 {
    public static void main(String[] args){
        System.out.println(cuttingRope(1));
    }

    // 剪绳子 递归
    public static  int cuttingRope(int n) {
        if (n<=1) return n;
        return helper(0,n,0);
    }

    public static int helper(int start , int n, int max){
        if (start >= n) return max;
        for (int i = start ;i<n;i++){
            helper(i+1,n,max);
        }
        return max;
    }
}
