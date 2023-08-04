package Important_Questions_in_java.Assignment8;

import java.util.Scanner;
@SuppressWarnings("ALL")
class Average {
    protected static void average_of_three_numbers(float n1, float n2, float n3) {
        float num1 = n1;
        float num2 = n2;
        float num3 = n3;
        float average = 0.0f;
        average = (num1+num2+num3) / 3;
        System.out.println("Average of three numbers: "+average);
    }
}


@SuppressWarnings("ALL")
public class q2 {
    // main method or drive code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second num: ");
        float n2 = sc.nextFloat();
        System.out.print("Enter third num: ");
        float n3 = sc.nextFloat();

        Average avg = new Average();
        avg.average_of_three_numbers(n1,n2,n3);
    }
}