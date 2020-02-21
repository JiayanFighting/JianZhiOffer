import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class code_50 {
    public static void main(String[] args){
        System.out.println(firstUniqChar("acdcabba"));
    }

    public static char firstUniqChar(String s) {
        int[] record = new int[26];
        int index;
        for (int i = 0;i<s.length();i++){
            index = s.charAt(i) - 97;
            record[index] ++;
        }
        for (int i = 0;i<s.length();i++){
            if (record[s.charAt(i)-97] == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
