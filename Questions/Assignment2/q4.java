package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* Check a number is it EVEN or ODD */
public class q4 {
    protected static void checkEvenOdd(int n) {
        if (n%2 == 0)
            System.out.println(n+" is EVEN");
        else
            System.out.println(n+" is ODD");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        checkEvenOdd(N);
    }
}