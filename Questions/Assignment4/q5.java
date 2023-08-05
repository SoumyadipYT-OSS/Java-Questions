package Important_Questions_in_java.Assignment4;

import java.util.Scanner;
@SuppressWarnings("ALL")
/* Reverse the words in a given string */
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        System.out.println("The reversed string is: " + reversedString.trim());
    }
}