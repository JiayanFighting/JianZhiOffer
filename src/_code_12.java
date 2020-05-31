public class _code_12 {
    public static void main(String[] args) {
        System.out.print(NumberOf1(-2147483648));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
//        int total = 0;
//        while (n > 0){
//            total += n & 1;
//             n >>>= 1;
//        }
//        return total;
    }
}
