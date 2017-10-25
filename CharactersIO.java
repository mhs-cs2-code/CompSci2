import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CharactersIO {

	static public void main(String args[]) throws IOException
	{
		InputStreamReader systemreader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(systemreader);
		System.out.print("String: ");
		String characters = in.readLine();
		int sum = 0;
		sum += characters.charAt(0);
		sum += characters.charAt(2);
		sum += characters.charAt(4);
		sum += characters.charAt(6);
		sum += characters.charAt(8);
		System.out.println(characters + " has a ASCII sum of " + sum); 
		System.out.println(characters.charAt(8) + " has a ASCII sum of " + (int) characters.charAt(8) ); 
	}
}
