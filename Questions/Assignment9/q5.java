package Important_Questions_in_java.Assignment9;
/* Stack using array */
@SuppressWarnings("ALL")
public class q5 {
    private static int[] arr;
    private static int top;
    private static int capacity;

    public q5(int stackSize) {      // constructor
        arr = new int[stackSize];
        capacity = stackSize;
        top = -1;
    }
    public static boolean isFull() {
        return top == capacity - 1;
    }
    public static int size_of_the_Stack() {
        return top+1;
    }
    public static boolean isEmpty() {
        return top == -1;
    }
    protected static void displayStack() {
        for (int i=0; i<=top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static void pushElement(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            System.exit(1);
        }

        System.out.println("New element has been added: "+x);
        arr[++top] = x;
    }

    private static int popElement() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            System.exit(1);
        }
        return arr[top--];
    }


    public static void main(String[] args) throws InterruptedException {
        q5 stack = new q5(5);
        stack.pushElement(20);
        stack.pushElement(22);
        stack.pushElement(23);

        System.out.print("Your stack: ");
        stack.displayStack();

        stack.popElement();     // removing element of last in element top of the stack
        System.out.println("\nUpdating stack...");
        Thread.sleep(600);
        stack.displayStack();
    }
}