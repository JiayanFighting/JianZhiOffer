public class code_22 {
    public static void main(String[] args){

    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) return head;
        int i = 1;
        ListNode q = head;
        while (i<=k && q != null){
            q = q.next;
            i++;
        }
        ListNode p = head;
        while (q!=null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
