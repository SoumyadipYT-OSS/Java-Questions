package Important_Questions_in_java.Assignment1;

import java.util.Scanner;
/* Write a java program to swap two numbers using the third variable */
@SuppressWarnings("ALL")
public class q1 {
    protected static void swapping(int a, int b) {
        int temp = 0;   // initialize local variable

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the variables\nnum1: "+a+"\nnum2: "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int n2 = sc.nextInt();
        swapping(n1,n2);
    }
}