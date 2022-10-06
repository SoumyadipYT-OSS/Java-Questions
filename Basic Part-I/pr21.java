package Basic_Part_1;

/*
 *  Write a Java program to convert a decimal number to octal number
*/
import java.util.Scanner;
public class pr21 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int decimal, quot, i=1, j;
		int[] octal = new int[100];
		System.out.print("Input a decimal number: ");
		decimal = sc.nextInt();
		quot = decimal;
		while (quot!=0)
		{
			octal[i++] = quot%8;
			quot = quot/8;
		}
		System.out.print("Octal number is: ");
		for (j=i-1; j>0; j--)
		{
			System.out.print(octal[j]);
		}
		System.out.println();
	}
}