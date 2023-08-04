package Important_Questions_in_java.Assignment1;

import java.util.Scanner;

/* Check a number is palindrome or not */
public class q4 {
    protected static void checkPalindrome(int givenNumber) {
        int reverseNum = 0;
        int x = givenNumber;

        while (x != 0) {
            int remainder = x % 10;
            reverseNum = reverseNum * 10 + remainder;
            x /= 10;
        }

        if (givenNumber == reverseNum) {
            System.out.println("It is a palindrome number!");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }


    // main method or drive code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checkPalindrome(n);
    }
}