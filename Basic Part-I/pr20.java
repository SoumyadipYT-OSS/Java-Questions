package Basic_Part_1;
/*
 * Write a Java program to convert a decimal number to hexadecimal number
*/
import java.util.Scanner;
public class pr20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int decimal, remainder;
		String hexadecimal="";
		
		char[] hex= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.print("Input a decimal number: ");
		decimal = sc.nextInt();
		
		while (decimal>0)
		{
			remainder = decimal%16;
			hexadecimal = hex[remainder]+hexadecimal;
			decimal = decimal/16;
		}
		System.out.println("Hexadecimal number is: "+hexadecimal); sc.close();
	}
}