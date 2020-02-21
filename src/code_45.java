import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class code_45 {
    public static void main(String[] args){
//        int[] nums = {3,30,34,5,9};
        int[] nums = {3,30,34};
        System.out.println(minNumber(nums));
    }

    // 分治
    // 两两组合
    public static String minNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);//将数组放入ArrayList中
        }
        //实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer str1, Integer str2) {
                // TODO Auto-generated method stub
                String s1=str1+""+str2;
                String s2=str2+""+str1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder s = new StringBuilder();
        for(int j:list){
            s.append(j);
        }
        return s.toString();
    }
}
