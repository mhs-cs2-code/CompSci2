package EndQProjects;

import java.util.Scanner;

public class JoggingDist {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please Enter Your AVERAGE Strides per Minute: ");
		double rate = myscan.nextDouble();
		myscan.nextLine();
		System.out.print("Please Enter HOURS Jogged: ");
	 	int hours = myscan.nextInt();
	 	System.out.print("Please Enter Minutes Jogged: ");
		int time = hours * 60 + myscan.nextInt();
		double feet = rate*(double) 2.5*time;
		System.out.println("Distance in Feet = " + feet);
		System.out.println("Distance in Miles = " + feet/5280.0);
		myscan.close();
	}
}
