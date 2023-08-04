package Important_Questions_in_java.Assignment2;

import java.util.Scanner;
/* Sum of N natural numbers */
public class q5 {
    protected static void sum_of_N_numbers(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate sum: ");
        int N = sc.nextInt();
        sum_of_N_numbers(N);
    }
}