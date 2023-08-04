package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* check the number is perfect or not */
public class q9 {
    protected static void checkPerfectNumber(int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i == 0)
                sum = sum + i;
        }

        if (sum == n)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not perfect number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        checkPerfectNumber(N);
    }
}