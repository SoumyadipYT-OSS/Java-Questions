package Important_Questions_in_java.Assignment3;

@SuppressWarnings("ALL")
public class q7_q10 {
    private static ListNode2 head;
    static class ListNode2 {
        static int data;
        static ListNode2 next;
        static ListNode2 prev;
        ListNode2(int data) {
            ListNode2.data = data;
            next = null;
            prev = null;
        }
    }

    // Question 7
    // method to delete a node from singly linked list
    protected static void deleteNode(int pos) {
        if (pos == 1)
            head = ListNode2.next;
        else {
            ListNode2 prev = head;
            int count = 1;
            while (count < pos-1) {
                prev = prev.next;
                count++;
            }
            ListNode2 curr = prev.next;
            prev.next = curr.next;
        }
    }

    // Question 8
    // method to insert a node at the end of the singly linked list
    protected static void insertAtEnd(int val) {
        ListNode2 newNode = new ListNode2(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode2 curr = head;
        while (null != curr.next)
            curr.next = newNode;

        curr.next = newNode;
    }

    // Question 9
    // add element in the middle of the singly linked list
    protected static ListNode2 findMiddleNode(ListNode2 head) {
        ListNode2 secondPointer = head;
        ListNode2 firstPointer = head;
        if (head == null)
            return null;

        while (firstPointer != null  &&  firstPointer.next != null) {
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next.next;
        }

        return secondPointer;
    }

    // Question 10
    // Print the linked list in reverse order (from tail to head)
    protected static ListNode2 reverseList(ListNode2 head) {
        if (head == null)
            return head;
        ListNode2 curr = head;
        ListNode2 prev = null;
        ListNode2 next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    // main method
    public static void main(String[] args) {
        q7_q10 list = new q7_q10();

        list.head = new ListNode2(1);
        ListNode2 second = new ListNode2(2);
        ListNode2 third = new ListNode2(3);

        list.head.next = second;
        second.next = third;
        third.next = null;
    }
}