package Important_Questions_in_java.Assignment4;

import java.util.Arrays;

/* Check two strings are Anagram or not */
public class q1 {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        String s11 = s1.toLowerCase();
        String s12 = s2.toLowerCase();

        if (s11.length() != s12.length()) {
            System.out.println("Both strings are not Anagrams");
        } else {
            char[] str1 = s11.toCharArray();
            char[] str2 = s12.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1,str2)) {
                System.out.println("Both strings are anagrams!");
            } else {
                System.out.println("Both strings are not anagrams.");
            }
        }
    }
}