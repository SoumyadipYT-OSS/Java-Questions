package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* Check a number positive, negative or zero */
public class q3 {
    protected static void checkNumber(float n) {
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        float N = sc.nextFloat();
        checkNumber(N);
    }
}