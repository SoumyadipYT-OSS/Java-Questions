package Important_Questions_in_java.Assignment4;

import java.util.Scanner;

/* Count no. of words in a given string */
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();         // woods

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("The number of words in the string is: " + count);
    }
}