import java.util.ArrayList;
import java.util.LinkedList;

public class MedianFinder {
    /** initialize your data structure here. */
    LinkedList<Integer> list ;
    public MedianFinder() {
        list = new LinkedList<>();
    }

    public void addNum(int num) {
        for (int i = 0;i<list.size();i++){
            if (list.get(i) >= num){
                list.add(i,num);
                return;
            }
        }
        list.add(list.size(),num);
    }

    // 0 1 2 3 4 5
    public double findMedian() {
        int len = list.size();
        if ((len & 1) == 1){ // 偶数个
            return (double) (list.get((len-1)/2)+list.get(len/2))/2;
        }else {
            return (double)list.get(len/2);
        }
    }
}
