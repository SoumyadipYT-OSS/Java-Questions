package Important_Questions_in_java.Assignment6;

import java.util.Scanner;

/* Count the number of digits in an integer */
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("The number of digits in the integer: "+count);
    }
}