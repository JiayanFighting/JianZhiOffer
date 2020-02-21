public class code_17 {
    public static void main(String[] args){
        int[] ret = printNumbers(1);
        for (int num : ret){
            System.out.print(num+" ");
        }
    }

    public static int[] printNumbers(int n) {
        if (n<=0) return null;
        int num = 1;
        while (n > 0){
            num = num * 10;
            n--;
        }
        num --;
        int[] ret = new int[num];
        for (int i = 1;i<= num;i++){
            ret[i-1] = i;
        }
        return ret;
    }
}
