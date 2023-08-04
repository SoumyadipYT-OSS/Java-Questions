package Important_Questions_in_java.Assignment3;
/*
    Write a java program to calculate the length of a singly linked list
*/
public class q6 {
    protected static ListNode head;
    static class ListNode {
        ListNode next;
        public ListNode() {
            next = null;
        }
    }

    // method to count the nodes of a singly linked list
    public int getCount() {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        q6 list = new q6();

        head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode fourth = new ListNode();

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        System.out.println("Length of linked list is: "+list.getCount());
    }
}