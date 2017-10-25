import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GolfScoreNoScanner {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		
		System.out.print("Your Name: ");
		String name = in.readLine();
		
		int golfA = 0, golfB = 0, golfC = 0;
		
		System.out.print("First Golf Score: ");
		golfA = Integer.parseInt(in.readLine());
		
		System.out.print("Second Golf Score: ");
		golfB = Integer.parseInt(in.readLine());
		
		System.out.print("Third Golf Score: ");
		golfC = Integer.parseInt(in.readLine());
		
		double average = (golfA + golfB + golfC) / 3.0;
		System.out.println(name + "'s Average Score: " + average);
		System.out.println("Length of " + name + "'s name: " + name.length());
		System.out.println();
		if("AEIOUaeiou".indexOf(name.charAt(0)) < 0)
			System.out.println("Your name does not start with a vowel");
		else
			System.out.println("Your name does start with a vowel");
		System.out.println("Your name has " + name.length() + " letters");
		int vowels = 0;

		for (char c: name.toCharArray()) {
			c = java.lang.Character.toLowerCase(c);
		    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		        vowels++;
		    }
		}
		System.out.println("Your name has " + vowels + " vowels");
		
	}
}
