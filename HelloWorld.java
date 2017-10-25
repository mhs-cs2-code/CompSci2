import java.util.Scanner;
public class HelloWorld {

	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.println(Math.max(a,b));
		s.close();
	}
}