package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* Find ASCII value of a character */

@SuppressWarnings("ALL")
public class q7 {
    protected static void find_ASCII(char ch) {
        int asciiValue = (int) ch;
        System.out.println("ASCII value: "+asciiValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        find_ASCII(ch);
    }
}