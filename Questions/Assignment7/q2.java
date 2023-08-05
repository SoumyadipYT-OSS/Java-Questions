package Important_Questions_in_java.Assignment7;

import java.util.Scanner;

/* Count alphabets, digits and special characters */
public class q2 {
    protected static void countAlphabetsDigitsSpacesSpecialCharacters(String str) {
        int alphabets=0, numbers=0, spaces=0, specialSymbol=0;
        int i=0;
        while (i<str.length()) {
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'  ||  ch>='a' && ch<='z') {
                alphabets++;
            } else if (ch>='0'  &&  ch<='9') {
                numbers++;
            } else if (ch==' ') {
                spaces++;
            } else {
                specialSymbol++;
            }
            i++;
        }
        System.out.println("No. of alphabets: "+alphabets);
        System.out.println("Total digits: "+numbers);
        System.out.println("No. of spaces: "+spaces);
        System.out.println("No. of special symbol: "+specialSymbol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        countAlphabetsDigitsSpacesSpecialCharacters(s);
    }
}