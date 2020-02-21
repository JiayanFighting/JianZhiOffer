import java.util.ArrayList;

public class code_62 {
    public static void main(String[] args){
        System.out.println(lastRemaining(10,17));
    }

    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
            list.add(i);
        }
        int begin = 0,index,last = 0;
        while (list.size() > 1){
            index = (begin + m - 1)%list.size();
            list.remove(index);
            begin = index;
        }
        return list.get(0);
    }
}
