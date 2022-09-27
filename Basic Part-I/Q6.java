package Basic_Part_1;

/*
 	Write a Java program to print the sum (addition), multiply, 
 	subtract, divide and remainder of two numbers
 */
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = sc.nextInt();
		System.out.print("Input second number: ");
		int b = sc.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Subtract: "+(a-b));
		System.out.println("Division: "+(a/b));
		System.out.println("Mod: "+(a%b));
		sc.close();
	}
}