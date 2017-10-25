import java.util.Scanner;

public class RandomRange {

	public static void main(String args[])
	{
		int lower, upper;
		Scanner myscan = new Scanner(System.in);
		for(int i = 0; i < 1; i++)
		{
			System.out.print("Lower Bound: ");
			lower = myscan.nextInt();
			System.out.print("Upper Bound: ");
			upper = myscan.nextInt();
			int random = ((int) Math.round(Math.random()*(upper-1-lower))) + (1+lower); 
			System.out.println("Your Random Number: " + random);
		}
		myscan.close();
	}
}
