public class LC141 {

    public boolean hasCycle(ListNode head) {

        ListNode first=head;
        ListNode slow=head;
        while(first!=null && first.next !=null)
        {
            first= first.next.next;
            slow=slow.next;

            if(first == slow)
                return true;
        }


        return false;
    }

    public static void main(String[] args) {

    }
}
