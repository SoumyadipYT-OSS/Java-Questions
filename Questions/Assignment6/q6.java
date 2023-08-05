package Important_Questions_in_java.Assignment6;

import java.util.Scanner;

/* Decimal to Binary conversion */
public class q6 {
    protected static void DecimalToBinary(int inputNumber) {
        System.out.print("Binary value: ");
        for (int i=15; i>=0; i--) {
            int binaryDigit = inputNumber >> i;
            if ((binaryDigit & 1) > 0)
                System.out.print("1");
            else
                System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal value: ");
        int num = sc.nextInt();
        DecimalToBinary(num);
    }
}