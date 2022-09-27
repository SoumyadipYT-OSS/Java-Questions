package Basic_Part_1;

/*
 * Write a java program to calculate sum of Integer numbers
 */
public class Q16 
{
	public static void main(String[] args) 
	{
		int n=10;
		int sum=0;
		for (int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum: "+sum);
	}
}