package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* check the year is leap year or not */
public class q8 {
    protected static void checkLeapYear(int year) {
        if ((year % 4 == 0   &&   year % 100 != 0)  ||  (year % 400 == 0))
            System.out.println("Leap year!");
        else
            System.out.println("Not leap year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        checkLeapYear(year);
    }
}