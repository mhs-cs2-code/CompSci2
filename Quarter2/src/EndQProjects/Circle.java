package EndQProjects;

import java.util.Scanner;

public class Circle {
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		double r = i.nextDouble();
		System.out.println("Radius: " + r);
		System.out.println("Diameter: " + (2*r));
		System.out.println("Circumference: " + (2*Math.PI*r));
		System.out.println("Area: " + (Math.PI*r*r));
		i.close();
	}
	
}
