package Important_Questions_in_java.Assignment1;

import java.util.Scanner;

/* Check a number is it Armstrong or not*/
public class q5 {
    protected static void checkArmstrongNumber(int n) {
        int originalNum, remainder, result = 0;
        originalNum = n;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if (result == n)
            System.out.println(n + " is an Armstrong number!");
        else
            System.out.println(n + " is not an Armstrong number");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        checkArmstrongNumber(N);
    }
}