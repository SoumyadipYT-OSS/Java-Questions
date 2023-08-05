package Important_Questions_in_java.Assignment6;
/* Find the root of quadratic equation */
@SuppressWarnings("ALL")
public class q10 {
    public static void main(String[] args) {
        double a = 7.2, b = 5, c = 9;
        double first_root, second_root;
        double det = b*b-4*a*c;

        if (det > 0) {
            first_root = (-b + Math.sqrt(det)) / (2*a);
            second_root = (-b - Math.sqrt(det)) / (2*a);
            System.out.format("First Root = %.2f \nand,\nSecond Root = %.2f", first_root, second_root);
        } else if (det==0) {
            first_root = second_root = -b / (2*a);
            System.out.format("First Root = Second Root = %.2f;", first_root);
        } else {
            double real = -b / (2*a);
            double imaginary = Math.sqrt(-det) / (2*a);
            System.out.printf("First Root: %.2f+%.2fi", real, imaginary);
            System.out.printf("\nSecond Root: %.2f-%.2fi", real, imaginary);
        }
    }
}