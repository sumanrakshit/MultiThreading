public class LC206 {
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev, current;
        current=head;
        prev=null;
        while(current !=null)
        {
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return  prev;

    }
    public static void main(String[] args) {

    }
}
