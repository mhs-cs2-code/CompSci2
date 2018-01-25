package EndQProjects;

import java.util.Scanner;

public class PopGrowth {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please Enter Initial and 1st Week Insect Population:  ");
		String[] parts = myscan.nextLine().split(" ");
		double[] x = new double[2];
		x[0] = Integer.parseInt(parts[0]);
		x[1] = Integer.parseInt(parts[1]);
		double growth = (x[1] - x[0]) / x[0];
		System.out.println("Growth Rate is " + growth*100 + "%");
		growth = x[1] / x[0];
		System.out.println("The Second Week Size Will Be " + growth*x[1]);
		myscan.close();
	}
}
