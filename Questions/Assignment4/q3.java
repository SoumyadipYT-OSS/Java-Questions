package Important_Questions_in_java.Assignment4;

import java.util.Scanner;

/* Convert string to an integer */
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        System.out.println("The integer value of the string is: "+num);
    }
}