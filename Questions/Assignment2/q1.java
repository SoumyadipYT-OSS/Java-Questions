package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* Find Fibonacci series value of N-th term*/
public class q1 {
    protected static void findFibonacciSeries(int n) {
        int a=0, b=1, c;    // local variable initialize
        if (n==0)
            System.out.println("The fibonacci series of "+n+"-th term is "+a);
        else if (n==1) {
            System.out.println("The fibonacci series of "+n+"-th term is "+b);
        } else {
            for (int i=2; i<=n; i++) {
                c = a+b;
                a = b;
                b = c;
            }

            System.out.println("The fibonacci series of "+n+"-th term is "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = sc.nextInt();
        findFibonacciSeries(N);
    }
}