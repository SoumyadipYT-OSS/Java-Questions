package Basic_Part_1;

/*
 	 • Write a Java program that takes three numbers as input
 	 to calculate and print the average of the numbers
*/
import java.util.Scanner;
public class Q12 
{
	static void average(float A,float B,float C)
	{
		float avg = (float)((A+B+C)/2);
		System.out.println("Average of "+A+","+B+" & "+C+" → "+avg);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = sc.nextInt();
		System.out.print("Input second number: ");
		int b = sc.nextInt();
		System.out.print("Input third number: ");
		int c = sc.nextInt();
		average(a, b, c);
		sc.close();
	}
}