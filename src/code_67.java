public class code_67 {
    public static void main(String[] args){
        System.out.println(strToInt(" "));
    }

    public static int strToInt(String str) {
        if (str.length() == 0) return 0;
        // 删除字符串前面的空字符
        int index = 0;
        while (index < str.length() && str.charAt(index) == ' '){
            index++;
        }
        if (index >= str.length()) return 0;
        // 判断第一个字符
        int fu = str.charAt(index) == '-' ? -1:1;
        int ret = 0;
        if (str.charAt(index) < 48 || str.charAt(index) > 57){//不是数字
            if (str.charAt(index) != '+' && str.charAt(index) != '-'){
                return 0;
            }else {
                index++;
            }
        }
        for (int i = index;i<str.length();i++){
            //非合法输入 结束
            if (str.charAt(i) < 48 || str.charAt(i) > 57){
                break;
            }
            // 判断是否超出界限
            if (fu == 1 && ret > (Integer.MAX_VALUE -str.charAt(i) + 48 )/10){//正数 判断是否超出上界
                return Integer.MAX_VALUE;
            }else if (fu == -1 && ret < (Integer.MIN_VALUE+str.charAt(i)-48)/10){//负数 判断是否超出下界
                return Integer.MIN_VALUE;
            }
            ret = ret * 10 + fu * (str.charAt(i) -48);
        }
        return ret;
    }
}
