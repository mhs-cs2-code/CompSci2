import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TheCalculator {

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		System.out.println("Possible Operators");
		System.out.println("Input | Operator");
		System.out.println("-------------------");
		System.out.println(" ADD  | Addition");
		System.out.println(" SUB  | Subtraction");
		System.out.println(" MUL  | Multiplication");
		System.out.println(" DIV  | Division");
		System.out.println("-------------------");

		String another = "YES";
		boolean printResult = true;
		while (!another.toLowerCase().equals("no") && !another.toLowerCase().equals("n")) {
			System.out.print("First Number ");
			double numA = Double.parseDouble(in.readLine());
			System.out.print("Second Number ");
			double numB = Double.parseDouble(in.readLine());
			System.out.print("Operator: ");
			String operation = in.readLine();
			double sol = 0.0;
			printResult = true;
			if (operation.equals("ADD"))
				sol = numA + numB;
			else if (operation.equals("SUB"))
				sol = numA - numB;
			else if (operation.equals("MUL"))
				sol = numA * numB;
			else if (operation.equals("DIV"))
				sol = numA / numB;
			else
			{
				System.out.println("Unknown Operator -- Invalid Result");
				printResult = false;
			}
			if(printResult)
				System.out.println("Your Solution: " + sol);
			System.out.print("Would you like to do another problem? ");
			another = in.readLine();
		}
		System.out.println("Thanks for using my calculator!");
	}
}
