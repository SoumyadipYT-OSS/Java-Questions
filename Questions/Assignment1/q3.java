package Important_Questions_in_java.Assignment1;

import java.util.Scanner;

/* Check a number prime or not */
@SuppressWarnings("ALL")
public class q3 {
    protected static void checkPrime(int num) {
        if (num <= 1)
            System.out.println("It is not prime number");

        for (int i=2; i<num; i++) {
            if (num % i  ==  0)
                System.out.println("The number is not prime.");
        }

        System.out.println("It is prime number!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}