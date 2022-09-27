package Basic_Part_1;

/*
 *	Write a Java program that takes two 
 *	numbers as input and display the product of two numbers
 */
import java.util.Scanner;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("The product of "+a+" and "+b+" is "+(a*b));
		sc.close();
	}
}