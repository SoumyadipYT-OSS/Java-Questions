package Basic_Part_1;

/*
 * Write a Java program to print the area and perimeter of a circle.
 */
import java.util.Scanner;
import java.lang.Math;
public class Q11 
{
	static void area_of_circle(float R)
	{
		float area = (float)(Math.PI*Math.pow(R, 2));
		System.out.println("Area: "+area);
	}
	static void perimeter_of_circle(float R)
	{
		float permtr = (float)(2*Math.PI*R);
		System.out.println("Perimeter: "+permtr);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius: ");
		float r = sc.nextFloat();
		area_of_circle(r);
		perimeter_of_circle(r);
		sc.close();
	}
}