public class _code_13 {
    public static void main(String[] args) {
        System.out.print(Power(2,-3));
    }

    public static double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        boolean flag = exponent < 0; // - true  + false
        exponent = Math.abs(exponent);
        double half = Power(base,exponent/2);
        double res = half * half;
        if (exponent % 2 == 1){
            res *= base;
        }
        return flag ? 1/res:res;
    }
}
