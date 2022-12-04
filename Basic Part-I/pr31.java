package Basic_Part_1;
import java.lang.System;
/* Write a java program to check whether Java is installed on your computer*/
public class pr31 
{
	public static void main(String[] args) 
	{
		System.out.println("Java Version: "+System.getProperty("java.version"));
		System.out.println("Java Runtime version: "+System.getProperty("java.runtime.vetrsion"));
		System.out.println("Java Home: "+System.getProperty("java.home"));
		System.out.println("Java Vendor: "+System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
	}
}