package Important_Questions_in_java.Assignment9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("ALL")
/* Check balanced parenthesis */
public class q4 {
    protected static boolean isBalanced(String str) {
        Deque<Character> deque = new LinkedList<>();
        if (str == null  ||  ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                if (!(c=='{' || c=='[' || c=='(' || c==')' || c=='}' || c==']')) {
                    return false;
                }
            }


            for (char ch : str.toCharArray()) {
                if (ch=='{' || ch=='[' || ch=='(') {
                    deque.addFirst(ch); // {()}
                } else {
                    if (!deque.isEmpty() && ((deque.peekFirst()=='{' && ch=='}')  ||  (deque.peekFirst()=='[' && ch==']')  ||  (deque.peekFirst()=='(' && ch==')'))) {
                        deque.removeFirst();
                    } else {
                        return false;
                    }
                }
            }
        }
        return deque.isEmpty();
    }

    // main method or drive code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter random parenthesis: ");
        String s = sc.nextLine();

        System.out.println(isBalanced(s));
    }
}