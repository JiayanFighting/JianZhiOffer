public class code_65 {
    public static void main(String[] args){
        System.out.println(add(5,9));
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int plus = (a ^ b); // 求和（不计进位）. 相同位置0，相反位置1
            System.out.println(a&b);
            b = ((a & b) << 1); // 计算进位. 先保留同为1的位，都为1的位要向左进位，因此左移1位
            a = plus;
        }
        return a;
    }
}
