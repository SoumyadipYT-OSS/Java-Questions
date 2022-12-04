package Basic_Part_1;

/*
 * Write a java program to convert a hexadecimal to a binary number.
*/
import java.util.Scanner;
public class pr29 
{
	public static int hexadecimal_to_decimal(String s)
	{
		String hexDigits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int d = hexDigits.indexOf(c);
			val = 16*val+d;
		}
		return val;
	}
	
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String hexadecimal;
		int decimal, i=1, j;
		int[] binary = new int[100];
		System.out.print("Enter hexadecimal number: ");
		hexadecimal = sc.nextLine();
		
		decimal = hexadecimal_to_decimal(hexadecimal);
		while (decimal!=0)
		{
			binary[i++] = decimal%2;
			decimal = decimal/2;
		}
		System.out.print("Equivalent binary number is: ");
		for (j=i-1; j>0; j--)
		{
			System.out.print(binary[j]);
		}
		System.out.println();
	}
}