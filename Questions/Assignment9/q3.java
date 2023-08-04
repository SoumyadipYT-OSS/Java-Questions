package Important_Questions_in_java.Assignment9;

import java.util.Scanner;
@SuppressWarnings("ALL")
/* Given integer N, find the sum of all prime numbers from 1 to N(inclusive) */
public class q3 {
    protected static boolean addition_of_PrimeIntegers(int n) {
        if (n==1) return false;
        for (int i=2; i<n; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    // main method or drive code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=2; i<=n; i++) {
            if (addition_of_PrimeIntegers(i))
                sum = sum + i;
        }
        System.out.println(sum);
    }
}