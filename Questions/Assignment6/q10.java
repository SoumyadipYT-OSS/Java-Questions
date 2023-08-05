package Important_Questions_in_java.Assignment7;

/* search an element in circular linked list */
@SuppressWarnings("ALL")
public class q10 {
    private static ListNode head;
    private static class ListNode {
        private int data;
        private static ListNode next;
        private ListNode head;
        private ListNode last;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    protected static ListNode searchElement(int keyValue) {
        if (head == null) {
            System.out.println("No node available");
        }
        int pos = 0;
        ListNode temp = head;

        while (temp != null) {
            if (temp.data == keyValue) {
                return temp;
            }
            pos++;
            temp = temp.next;
        }
        return null;
    }
}