package Important_Questions_in_java.Assignment2;

import java.util.Scanner;
/* Factorial of a number*/
public class q6 {
    protected static void findFactorial(int n) {
        int factorial = 1;
        for (int i=1; i<= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = sc.nextInt();
        findFactorial(N);
    }
}