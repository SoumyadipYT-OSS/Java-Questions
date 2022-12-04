package Basic_Part_1;
/*Write a java program to compare two numbers.*/
import java.util.Scanner;
public class pr32 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int a = sc.nextInt();
		System.out.print("Input second integer: ");
		int b = sc.nextInt();
		System.out.println(a+"!="+b+" → "+(a!=b));
		System.out.println(a+"<"+b+" → "+(a<b));
		System.out.println(a+"<="+b+" → "+(a<=b));
	}
}