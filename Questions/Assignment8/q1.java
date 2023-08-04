package Important_Questions_in_java.Assignment8;

import java.util.Scanner;
@SuppressWarnings("ALL")
public class q1 {
    private static void inputUserInformation() {
        Scanner in = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

//        Name
        System.out.print("\n\nEnter your name: ");
        String name = in.nextLine();

//        Registration No.
        System.out.print("Enter registration no.: ");
        long regNo = num.nextLong();

//        DOB
        System.out.print("Enter DOB: ");
        int birthdate = num.nextInt();
        System.out.print("/");
        int birth_month = num.nextInt();
        System.out.print("/");
        int birth_year = num.nextInt();

//        Branch
        System.out.print("Enter your branch: ");
        String branch = in.nextLine();

//        Calling printInformation
        printInformation(name,regNo,birthdate,birth_month,birth_year,branch);
    }

    private static void printInformation(String studentName, long regNo, int date, int month, int year, String branch) {
        String month_in_word = "";

//        condition check for month
        if (date == 0 || month == 0 || year == 0)
            System.out.println("Invalid Input!");
        if (month == 1)
            month_in_word = "January";
        if (month == 2)
            month_in_word = "February";
        if (month == 3)
            month_in_word = "March";
        if (month == 4)
            month_in_word = "April";
        if (month == 5)
            month_in_word = "May";
        if (month == 6)
            month_in_word = "June";
        if (month == 7)
            month_in_word = "July";
        if (month == 8)
            month_in_word = "August";
        if (month == 9)
            month_in_word = "September";
        if (month == 10)
            month_in_word = "October";
        if (month == 11)
            month_in_word = "November";
        if (month == 12)
            month_in_word = "December";


        System.out.println("\n\t___Student Details___");
        System.out.println("Name: "+studentName);
        System.out.println("Reg. no.: "+regNo);
        System.out.println("DOB: "+date+"/"+month_in_word+"/"+year);
        System.out.println("Branch: "+branch);
    }



    //    main method or drive code
    public static void main(String[] args) {
        q1 firstStudent = new q1();
        firstStudent.inputUserInformation();

        q1 secondStudent = new q1();
        secondStudent.inputUserInformation();

        q1 thirdStudent = new q1();
        thirdStudent.inputUserInformation();
    }
}