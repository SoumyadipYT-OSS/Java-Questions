package Important_Questions_in_java.Assignment1;

import java.util.Scanner;

/* Swap two numbers without using third variable */
@SuppressWarnings("ALL")
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();

        a = a+b;    // value of a increment
        b = a-b;    // value of b decrement
        a = a-b;    // value of a decrement
        System.out.println("\nAfter swapping\nnum1: "+a+"\nnum2: "+b);
    }
}