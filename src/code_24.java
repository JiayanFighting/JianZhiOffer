public class code_24 {
    public static void main(String[] args){

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        while (head.next!=null){
            ListNode q = head.next;
            head.next = q.next;
            q.next = preHead.next;
            preHead.next = q;
        }
        return preHead.next;
    }
}
