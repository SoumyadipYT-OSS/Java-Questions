package Basic_Part_1;

/*
 * Write a java program to convert a binary number to octal number
*/
import java.util.Scanner;
public class pr24 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int binary, binary1, remainder, decimal=0, quot, i=1, j;
		int[] octal = new int[100];
		System.out.print("Input a binary number: ");
		binary = sc.nextInt();
		binary1 = binary;
		
		while (binary>0)
		{
			remainder = binary%10;
			decimal = decimal+remainder*i;
			i=i*2;
			binary = binary/10;
		}
		
		i=1;
		quot=decimal;
		
		while (quot>0)
		{
			octal[i++] = quot%8;
			quot = quot/8;
		}
		System.out.print("Equivalent octal value of "+binary1+" is: ");
		for (j=i-1; j>0; j--)
		{
			System.out.print(octal[j]);
		}
		System.out.println();
	}
}