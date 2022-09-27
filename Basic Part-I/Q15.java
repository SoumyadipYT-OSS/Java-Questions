package Basic_Part_1;

/*
 * Write a java program swapping two variable using third variable
 */
public class Q15 
{
	public static void main(String[] args) 
	{
		int a=87;
		int b=98;
		System.out.println("Value of a: "+a);		
		System.out.println("Value of b: "+b);
		int temp=0;	// Using third variable
		temp=b;
		b=a;
		a=temp;
		System.out.println("--Swapping the variables--");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}