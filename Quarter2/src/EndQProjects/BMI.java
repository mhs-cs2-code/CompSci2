package EndQProjects;

import java.util.Scanner;

public class BMI {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Your Weight (in pounds): ");
		double pounds = myscan.nextDouble();
		System.out.print("Your Height (in inches): ");
		double inches = myscan.nextDouble();
		double kg = pounds * 0.464;
		double meters = inches * 0.0254;
		double bmi = kg / (meters*meters);
		System.out.println("Your BMI: " + bmi);
		myscan.close();
	}
}
