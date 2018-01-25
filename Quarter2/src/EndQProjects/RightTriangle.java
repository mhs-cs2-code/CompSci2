package EndQProjects;

import java.util.Scanner;

public class RightTriangle {
/* Given the length of one side, the opposite side,  and the length of one angle, beta, calculate and display the remaining angle, alpha, 
 * along with the remaining two sides, adjacent and hypotenuse
 */
	public static void triangle(double beta, double z)
	{
		System.out.println("Angle B: " + (90-beta));
		double bRads = 0.0174532925 * beta;
		double hypo = z/Math.tan(bRads);
		double adj = (hypo*hypo) - (z*z);
		adj = Math.sqrt(adj);
		System.out.println("Y: " + hypo);
		System.out.println("X: " + adj);
		System.out.println("X^2 + Z^2 = Y^2");
		System.out.println(adj*adj + " + " + z*z + " = " + hypo*hypo);
	}
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		double beta = myscan.nextDouble();
		double opp = myscan.nextDouble();
		triangle(beta, opp);
		myscan.close();
	}
}
