package Important_Questions_in_java.Assignment6;

import java.util.Scanner;

/* Remove spaces from a string */
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String withoutSPaces = str.replaceAll("\\s","");
        System.out.println("The string without spaces: "+withoutSPaces);
    }
}