package Important_Questions_in_java.Assignment6;

import java.util.Scanner;

/* Find non-repeating characters in a string  */
public class q1 {
    protected static void non_repeating_character(String str) {
        int i, j;
        int len_of_string = str.length();
        char ch;
        for (i = 0; i < len_of_string; i++) {
            ch = str.charAt(i);
            for (j = 0; j < len_of_string; j++) {
                if (i != j && ch == str.charAt(j)) {
                    break;
                }
            }
            if (j == len_of_string) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        non_repeating_character(inputString);
    }
}