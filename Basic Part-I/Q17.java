package Basic_Part_1;

/*
 * Write a Java program to add two binary numbers.
*/
import java.util.Scanner;
public class Q17 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int carry=0, i=0;
		int[] sum = new int[10];
		System.out.print("Input first binary number: ");
		long a = sc.nextLong();
		System.out.print("Input second binary number: ");
		long b = sc.nextLong();
		
		while (a!=0 || b!=0)
		{
			sum[i++] = (int)((a%10+b%10+carry)%2);
			carry = (int)((a%10+b%10+carry)/2);
			a=a/10;
			b=b/10;
		}
		if (carry!=0)
			sum[i++] = carry;
		--i;
		System.out.print("Sum of two binary numbers: ");
		while (i>=0)
			System.out.print(sum[i--]);
		System.out.println();  	sc.close();
	}
}