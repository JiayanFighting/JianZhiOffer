import java.util.ArrayList;
import java.util.LinkedList;

public class _code_03 {
    public static void main(String[] args) {


    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        while (listNode != null){
            list1.addFirst(listNode.val);
            listNode = listNode.next;
        }
        list.addAll(list1);
        return list;
    }
}
