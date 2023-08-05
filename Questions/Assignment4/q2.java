package Important_Questions_in_java.Assignment4;

import java.util.HashMap;
import java.util.Map;
/*
    write a java program to find the maximum occurring
    character in a given string
*/
public class q2 {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
    }
}