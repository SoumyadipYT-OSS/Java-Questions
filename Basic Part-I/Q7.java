package Basic_Part_1;

/*
 * Write a Java program that takes a number as input and 
 * prints its multiplication table upto 10
*/
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer number: ");
		int n = sc.nextInt();
		System.out.println("---Multiplication Table---");
		for (int i=1; i<=10; i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}
		sc.close();
	}
}