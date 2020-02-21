import java.util.HashMap;

public class code_18 {
    public static void main(String[] args){

    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode ret = pre;
        while (pre.next !=null){
            if (pre.next.val == val){
                pre.next = pre.next.next;
            }else pre = pre.next;
        }
        return ret.next;
    }
}
