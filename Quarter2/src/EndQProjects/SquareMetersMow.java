package EndQProjects;

import java.util.Scanner;

public class SquareMetersMow {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please Enter Length and THEN the Width of the Yard (in Meters): ");
		String[] parts = myscan.nextLine().split(" ");
		int base = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
		System.out.print("Please Enter Length and THEN the Width of the House (in Meters): ");
		parts = myscan.nextLine().split(" ");
		base -= (Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]));
		System.out.println("It will Take You " + base/120.0 +" Minutes to Mow the Yard");
		myscan.close();
	}
}
