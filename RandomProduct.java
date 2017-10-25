import java.util.Scanner;
public class RandomProduct {

	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		int random = ((int) Math.round(Math.random()*9.0)) + 1; // add one to compensate for 0 case
																// nine to prevent going over 10
		System.out.println("Your random number: " + random);
		System.out.print("Enter a number: ");
		int user_input = myscan.nextInt();
		System.out.println("Random Product: " + (user_input * random));
		myscan.close();
	}
}
