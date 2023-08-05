package Important_Questions_in_java.Assignment7;
/* Replace String space with a given character */
public class q1 {
    public static void main(String[] args) {
        String s = "Hello World Java programming language";
        char ch = '_';
        s = s.replace(' ',ch);
        System.out.println(s);
    }
}