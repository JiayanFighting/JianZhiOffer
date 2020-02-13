import java.util.HashMap;

public class code_3 {
    public static void main(String[] args){
        System.out.println(replaceSpace(" We are happy."));
    }

    public static String replaceSpace(String s) {
        if (s.length() == 0) return s;
        StringBuilder ret = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                ret.append("%20");
            }else {
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();
    }

    public static String replaceSpace2(String s) {
        if (s.length() == 0) return s;
        String ret = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                ret += "%20";
            }else {
                ret += s.charAt(i);
            }
        }
        return ret;
    }
}
