package EndQProjects;

import java.util.Scanner;

public class TempConvert {
	private static double ftoc(double f)
	{
		return (f-32)*(5/9);
	}
	private static double ctof(double c)
	{
		return (c+32)*(9/5);
	}
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Choose Calc (0: F-> C / 1: C -> F): ");
		int choice = myscan.nextInt();
		System.out.print("Temp to Convert: ");
		double temp = myscan.nextDouble();
		double converted = choice == 0 ? ftoc(temp) : ctof(temp);
		System.out.println("Converted: " + converted);
		myscan.close();
	}
}
