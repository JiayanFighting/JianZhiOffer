public class code_25 {
    public static void main(String[] args){

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode preHead = new ListNode(0);
        ListNode head = preHead;
        while (l1 !=null || l2!=null){
            if (l1 == null || (l2!=null && l1.val > l2.val)){
                head.next = l2;
                l2 = l2.next;
            }else{
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        return preHead.next;
    }
}
