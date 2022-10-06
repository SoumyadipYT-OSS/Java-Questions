package Basic_Part_1;

/*
 * Write a Java program to convert a octal number to a decimal number
*/
import java.util.Scanner;
public class pr25 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long octal, decimal=0;
		int i=0;
		System.out.print("Input any octal number: ");
		octal = sc.nextLong();
		while (octal!=0)
		{
			decimal = (long) (decimal+(octal%10)*Math.pow(8, i++));
			octal = octal/10;
		}
		System.out.print("Equivalent decimal number: "+decimal);
	}
}