package Important_Questions_in_java.Assignment6;

import java.util.Scanner;
/* Greatest Common Divisor (GCD) */
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 1;

        for (int i=1; i<=n1  &&  i<=n2; ++i) {
            if (n1%i == 0  &&  n2%i == 0)
                gcd = i;
        }
        System.out.println("GCD: "+gcd);
    }
}