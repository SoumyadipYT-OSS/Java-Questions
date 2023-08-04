package Important_Questions_in_java.Assignment2;

import java.util.Scanner;

/* Check the character whether is it vowel or consonant */
public class q2 {
    protected static void checkVowelConsonant(char c) {
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            System.out.println(c+" is vowel");
        else
            System.out.println(c+" is consonant");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character word: ");
        char ch = sc.next().charAt(0);
        checkVowelConsonant(ch);
    }
}