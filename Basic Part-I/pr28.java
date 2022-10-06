package Basic_Part_1;

/*
 * Write a java program to convert a hexadecimal to a decimal number
*/
import java.util.Scanner;
public class pr28 
{
	public static int hex_to_decimal(String s)
	{
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int value=0;
		for (int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			value = 16*value+d;
		}
		return value;
	}
	
	
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hexadecimal numbner: ");
		String hexadecimal = sc.nextLine();
		
		int decimal = hex_to_decimal(hexadecimal);
		System.out.println("Equvalent decimal number is: "+decimal);
	}
}