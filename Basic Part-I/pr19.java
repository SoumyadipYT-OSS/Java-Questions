package Basic_Part_1;

/*
 * Write a Java program to convert a decimal number to binary number
*/
import java.util.Scanner;
public class pr19 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int decimal, quot, i=1,j;
		int[] binary = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		decimal = sc.nextInt();
		quot = decimal;
		while (quot!=0)
		{
			binary[i++] = quot%2;
			quot = quot/2;
		}
		System.out.print("Binary number is: ");
		for (j=i-1; j>0; j--)
		{
			System.out.print(binary[j]);
		}
		System.out.println();
	}
}