package Important_Questions_in_java.Assignment7;
/* Create and display circular linked list */

class CircularSinglyLinkedList {
    private static ListNode last;
    private static int length;
    private static class ListNode {
        private ListNode next;
        private int data;
        public ListNode(int data) {     // constructor
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }
    public int length() {
        return length;
    }
    public static void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(10);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;
        while(first != last) {
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.print(first.data);
    }


    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.display();
    }
}