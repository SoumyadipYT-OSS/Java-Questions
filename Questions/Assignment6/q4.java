package Important_Questions_in_java.Assignment7;

import java.util.Scanner;

/* Convert Celsius to Fahrenheit and Fahrenheit to Celsius */
@SuppressWarnings("ALL")
public class q4 {
    protected static void FahrenheitToCelsius(double Fahrenheit) {
        double F = Fahrenheit, C=0.0f;

        C = ((F - 32)*5)/9;
        System.out.println("Celsius: "+C);
    }

    protected static void CelsiusToFahrenheit(double cel) {
        double Celsius = cel, Fahrenheit = 0.0f;

        Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Fahrenheit: "+Fahrenheit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius value: ");
        double c = sc.nextDouble();
        CelsiusToFahrenheit(c);

        System.out.print("\nEnter Fahrenheit value: ");
        double f = sc.nextDouble();
        FahrenheitToCelsius(f);
    }
}