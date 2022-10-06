package Basic_Part_1;

/*
 * Write a java program to convert a octal number to a binary number
*/
import java.util.Scanner;
public class pr26 
{
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] oc = {0,1,10,11,100,101,110,111};
		long octal, tempoctal, binary, place;
		int remainder;
		System.out.print("Input any octal number: ");
		octal = sc.nextLong();
		tempoctal = octal;
		binary=0;
		place=1;
		while (tempoctal!=0)
		{
			remainder = (int) (tempoctal%10);
			binary = oc[remainder]*place+binary;
			tempoctal /= 10;
			place *= 1000;
		}
		System.out.println("Equivalent binary number: "+binary);
	}
}