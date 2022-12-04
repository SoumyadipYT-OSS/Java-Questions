package Basic_Part_1;

// Write a java program to convert a hexadecimal to a octal number
import java.util.Scanner;
public class pr30 
{
	public static int hex_to_decimal(String s)
	{
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val=0;
		for (int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16*val+d;
		}
		return val;
	}
	
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		int[] octal = new int[100]; int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hexadecimal value: ");
		String hexNum = sc.nextLine();
		
		int decNum = hex_to_decimal(hexNum);
		while (decNum!=0)
		{
			octal[i++] = decNum%8;
			decNum = decNum/8;
		}
		System.out.print("Equivalent of octal number is: ");
		for (int j=i-1; j>0; j--)
		{
			System.out.print(octal[j]);
		}
		System.out.println();
	}
}