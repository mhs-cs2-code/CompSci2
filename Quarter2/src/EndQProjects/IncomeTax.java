package EndQProjects;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Gross Salary: ");
		double salary = myscan.nextDouble();
		System.out.print("Enter the Number of Dependants: ");
		double depend = myscan.nextDouble();
		double agi = salary;
		agi -= 1000;
		agi -= (2000*depend);
		double tax = agi * 0.20;
		System.out.println("Your Taxes Are: " + tax);
		myscan.close();
	}
}
