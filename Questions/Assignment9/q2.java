package Important_Questions_in_java.Assignment9;
/* Find Largest prime factor of a number */
public class q2 {
    protected static void LargestPrimeFactor(int n) {
        int num = n;
        int primeNumber = -1;
        while (n%2 == 0) {
            primeNumber = 2;
            n >>= 1;
        }

        for (int i=3; i<=Math.sqrt(n); i+=2) {
            while (n%i == 0) {
                primeNumber = i;
                n /= i;
            }
        }

        if (n>2)
            primeNumber = n;

        System.out.println("Largest prime factor of "+num+" is "+primeNumber);
    }

    // main method
    public static void main(String[] args) {
        int n = 30;
        LargestPrimeFactor(n);
    }
}