package EndQProjects;

import java.util.Scanner;

public class PythTheorem {
	public static double twoSides(double a, double b)
	{
		return Math.sqrt((a*a)+(b*b));
	}
	public static double sideHypo(double a, double c)
	{
		return Math.sqrt(c*c-a*a);
	}
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("side 1: ");
		double sideA = myscan.nextDouble();
		System.out.print("side 2: ");
		double sideB = myscan.nextDouble();
		System.out.println("side 3: " + twoSides(sideA, sideB));
		myscan.close();
	}
}
