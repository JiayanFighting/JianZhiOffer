public class _code_16 {
    public static void main(String[] args) {

    }

    //输入两个单调递增的链表，输出两个链表合成后的链表。
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p =head;
        while (list1 !=null && list2!=null){
            if (list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        while (list1 !=null){
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }
        while (list2 !=null){
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }
        return head.next;
    }
}
