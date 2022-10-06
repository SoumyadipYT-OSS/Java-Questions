package Basic_Part_1;

/*
 * Writes a java program to convert a octal to a hexadecimal number
*/
import java.util.Scanner;
public class pr27 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String octal, hexadecimal;
		int decimal;
		System.out.print("Enter octal number: ");
		octal = sc.nextLine();
		
		decimal = Integer.parseInt(octal,8);
		hexadecimal = Integer.toHexString(decimal);
		System.out.println("Equivalent hexadecimal number: "+hexadecimal);
	}
}