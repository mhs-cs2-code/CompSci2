package EndQProjects;

import java.util.Scanner;

public class DogYears {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		System.out.print("Dog Years: ");
		double dogyears = myscan.nextDouble();
		double human;
		if(dogyears > 1)
		{
			human = ((dogyears-1) * (16.0/3)) + 13;
		}
		else if(dogyears > 0)
		{
			human = dogyears * 13;
		}
		else
		{
			human = 0;
		}
		System.out.println("Approximate Human Years " + human);
		myscan.close();
	}
}
