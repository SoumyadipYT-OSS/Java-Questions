package Basic_Part_1;

/*
 * Write a Java program to convert a binary number to hexadecimal number
*/
import java.util.Scanner;
public class pr23 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] hexadecimal = new int[1000];
		long remainder, decimal=0; int i=1, j=0;
		System.out.print("Input a binary number: ");
		long binary=sc.nextLong();
		while (binary>0)
		{
			remainder=binary%2;
			decimal=decimal+remainder*i;
			i=i*2;
			binary=binary/10;
		}
		i=0;
		while (decimal!=0)
		{
			hexadecimal[i] = (int)decimal%16;
			decimal = decimal/16;
			i++;
		}
		
		
		System.out.print("Hexadecimal value is: ");
		for (j=i-1; j>=0; j--)
		{
			if (hexadecimal[j]>9)
			{
				System.out.print((char)(hexadecimal[j]+55)+"\n");
			}
			else
			{
				System.out.println(hexadecimal[j]);
			}
		}
	}
}