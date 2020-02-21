public class code_58_2 {
    public static void main(String[] args){
        System.out.println(reverseLeftWords("abcdefg",2));
    }

    public static String reverseLeftWords(String s, int n) {
        if (n > s.length() ) return s;
        return s.substring(n)+s.substring(0,n);
    }
}
