import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class JulianDateThing {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		System.out.println("1 -- Julian Date to Normal Date");
		System.out.println("2 -- Normal Date to Julian Date");
		System.out.println("3 -- Difference Between Normal Date to Normal Date");
		System.out.print("Choose Function: ");
		int option = Integer.parseInt(in.readLine());
		if(option == 1)
		{
			System.out.print("Julian Date: ");
			String julian = in.readLine();
			Date myDate = new SimpleDateFormat("yyyyD").parse(julian);
			System.out.println(myDate);
			
		}
		else if(option == 2)
		{
			System.out.print("Date (MM/DD/YYYY): ");
			String date = in.readLine();
			String[] parts = date.split("[/]");
			int p[] = new int[3];
			p[0] = Integer.parseInt(parts[0]);
			p[1] = Integer.parseInt(parts[1]);
			p[2] = Integer.parseInt(parts[2]);
			String jDate = parts[2];
			LocalDate start = LocalDate.of(p[2], 1, 1);	
			LocalDate end = LocalDate.of(p[2], p[0], p[1]);
			long p2 = ChronoUnit.DAYS.between(start, end);
			jDate += (p2+1);
			System.out.println("Julian Date: " + jDate);
		}
		else if(option == 3)
		{
			int birthyear, birthmonth, birthday;
			String birthin;
			String[] parts;
			System.out.print("Date (MM/DD/YYYY): ");
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
		else
		{
			System.out.println("Invalid Option");
		}
	}

}
