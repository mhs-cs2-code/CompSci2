import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class LibraryFine {

	static public void main(String args[]) throws IOException
	{
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		System.out.print("First Name: ");
		String fname = in.readLine();
		System.out.print("Middle Name: ");
		String mname = in.readLine();
		System.out.print("Last Name: ");
		String lname = in.readLine();
		double fines[] = new double[10];
		double sum = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter the Fine for Bool #" + (i+1) + ": ");
			fines[i] = Double.parseDouble(in.readLine());
			sum += fines[i];
		}
		Arrays.sort(fines);
		System.out.println(fname + " " + mname + " " + lname + ",  Your total fine is: $" + sum);
		System.out.println("Min Fine: $" + fines[0]);
		System.out.println("Max Fine: $" + fines[9]);
	}
}