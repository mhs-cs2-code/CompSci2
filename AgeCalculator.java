import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
public class AgeCalculator {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		int birthyear, birthmonth, birthday;
		String birthin;
		String[] parts;
		System.out.print("Birthday (MM/DD/YYYY): ");
		birthin = in.readLine();
		parts = birthin.split("[/]");
		birthmonth=Integer.parseInt(parts[0]);
		birthday=Integer.parseInt(parts[1]);
		birthyear=Integer.parseInt(parts[2]);
		LocalDate start = LocalDate.of(birthyear, birthmonth, birthday);	
		LocalDate end = LocalDate.now();
		Period p = Period.between(start, end);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
		                   " months, and " + p.getDays() +
		                   " days old.");
	}
}