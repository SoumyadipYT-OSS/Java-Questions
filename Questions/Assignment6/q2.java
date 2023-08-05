package Important_Questions_in_java.Assignment6;

import java.util.Scanner;

/* Convert Binary to Decimal */
public class q2 {
    protected static void Binary_To_Decimal(long inputNumber) {
        int decimalNumber=0, i=0;
        long remainder;

        while(inputNumber != 0) {
            remainder = inputNumber % 10;
            inputNumber /= 10;
            decimalNumber += remainder * Math.pow(2,i);
            ++i;
        }
        System.out.println("Decimal Value: "+decimalNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long num = sc.nextLong();
        Binary_To_Decimal(num);
    }
}