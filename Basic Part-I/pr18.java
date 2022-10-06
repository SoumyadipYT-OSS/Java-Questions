package Basic_Part_1;

/*
 * Write a program to multiply two binary numbers
 */
import java.util.Scanner;
public class pr18 
{
	static long calc(long a, long b)
	{
		int i=0;
		long rmndr=0;
		long result=0;
		long[] sum = new long[20];
		while (a!=0 || b!=0)
		{
			sum[i++] = (a%10+b%10+rmndr)%2;
			rmndr = (a%10+b%10+rmndr)/2;
			a=a/10;
			b=b/10;
		}
		if (rmndr!=0)
		{
			sum[i++] = rmndr;
		}--i;
		while (i>=0)
		{
			result = result*10+sum[i--];
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		long a, b, mul=0;
		int digit, factor=1;
		System.out.print("Enter first binary number: ");
		a = sc.nextLong();
		System.out.print("Enter second binary number: ");
		b = sc.nextLong();
		while (b!=0)
		{
			digit=(int)(b%10);
			if (digit==1)
			{
				a=a*factor;
				mul=calc(a, mul);
			}
			else
			{
				a=a*factor;
			}
			b=b/10;
			factor=10;
		}
		System.out.println("\nfirstBinary x secondBinary = "+mul);
		sc.close();
	}
}