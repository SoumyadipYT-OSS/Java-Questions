package Important_Questions_in_java.Assignment1;

import java.util.Scanner;

/* Find the largest among the three numbers */
public class q6 {
    protected static void findLargest_Among_ThreeNumbers(float a, float b, float c) {
        if (a>b && a>c)
            System.out.println(a+" is the largest number");
        if (b>a && b>c)
            System.out.println(b+" is the largest number");
        if (c>a && c>b)
            System.out.println(c+" is the largest number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second num: ");
        float n2 = sc.nextFloat();
        System.out.print("Enter third num: ");
        float n3 = sc.nextFloat();
        findLargest_Among_ThreeNumbers(n1,n2,n3);
    }
}