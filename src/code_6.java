import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class code_6 {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        int[] ret = reversePrint(head);
        for (int num:ret){
            System.out.print(num +" ");
        }
    }

    public static int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int len = list.size();
        int[] ret = new int[len];
        for (int i = 0;i<len;i++){
            ret[len-1-i] = list.get(i);
        }
        return ret;
    }
}
