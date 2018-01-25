package EndQProjects;

import java.util.Scanner;

public class MyMath {
	public static double abs(int x)
	{
		if(x < 0)
			return -x;
		return x;
	}
	public static String even(int x)
	{
		if(x % 2 == 0)
			return "Yes";
		return "No";
	} 
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("First Number: ");
		int numA = myscan.nextInt();
		System.out.println("Square Root: " + Math.sqrt(numA));
		System.out.println("Cube: " + Math.pow(numA,3));
		System.out.println("Absolute Value: " + abs(numA));
		System.out.println("Even: " + even(numA));
		System.out.println("Squared: " + Math.pow(numA,2));
		System.out.println("");
		System.out.print("Second Number: ");
		int numB = myscan.nextInt();
		System.out.println("Larger: " + (numA > numB ? numA : numB));
		System.out.println("Sum: " + (numA + numB));
		System.out.println("Difference: " + (numA - numB));
		System.out.println("Product: " + (numA * numB));
		System.out.println("Quotient: " + (numA / (double) numB));
		myscan.close();
	}
}
