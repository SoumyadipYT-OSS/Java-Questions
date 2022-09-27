package Basic_Part_1;

/*
 * Write a java program to swap two variables without using 
 * third variable
 */
public class Q14 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=4;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		a=a-b;
		b=b+a;
		a=b-a;
		System.out.println("--Swapping the variables--");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}