public class _code_15 {
    public static void main(String[] args) {

    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return head;
        ListNode a=head;
        ListNode b=head;
        for(int i=0;i<k;i++){
            if(a==null) return a;
            a=a.next;
        }
        while(a!=null) {
            a=a.next;
            b=b.next;
        }
        return b;
    }
}
