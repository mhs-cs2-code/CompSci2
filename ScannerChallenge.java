import java.util.Arrays;
import java.util.Scanner;

public class ScannerChallenge {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int[] integers = new int[10];
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Number: ");
		    integers[i] = scanner.nextInt();
		}
		Arrays.sort(integers);
		int sumof = 0;
		int odds = 0;
		int evens = 0;
		for( int i : integers) {
			sumof += i;
			if(i%2 == 0)
				evens++;
			else
				odds++;
		}
		System.out.println("Min Value: " + integers[0]);
		System.out.println("Max Value: " + integers[9]);
		System.out.println("Sum of Values: " + sumof);
		System.out.println("Average of Values: " + sumof/10.0);
		System.out.println("SQRT of Sum: " + Math.sqrt(sumof));
		System.out.println("Count of Odds: " + odds);
		System.out.println("Count of Evens: " + evens);
		scanner.close();
	}
}
