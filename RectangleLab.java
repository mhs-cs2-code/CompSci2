import java.util.Scanner;

public class RectangleLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myscan = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("Option 1: Check Point");
		System.out.println("Option 2: Check If Rectangle");
		System.out.println("=================");
		System.out.print("Option: ");
		int option = myscan.nextInt();
		if(option == 1)
		{
			System.out.print("Point #1 x,y: ");
			String pointA = myscan.next();
			double xA = Double.parseDouble(pointA.split(",")[0]);
			double yA = Double.parseDouble(pointA.split(",")[1]);
			System.out.print("Point #2 x,y: ");
			String pointB = myscan.next();
			double xB = Double.parseDouble(pointB.split(",")[0]);
			double yB = Double.parseDouble(pointB.split(",")[1]);
			System.out.print("Test Point x,y: ");
			String pointTest = myscan.next();
			double xTest = Double.parseDouble(pointTest.split(",")[0]);
			double yTest = Double.parseDouble(pointTest.split(",")[1]);
			if(xA < xTest && xTest < xB && yTest > yA && yTest < yB)
			{
				System.out.println("Test Point Is In Rectangle");
			}
			else
			{
				System.out.println("Test Point Not In Rectangle");
			}
		}
		else if(option == 2)
		{
			System.out.print("Point #1 x,y: ");
			String pointA = myscan.next();
			double xA = Double.parseDouble(pointA.split(",")[0]);
			double yA = Double.parseDouble(pointA.split(",")[1]);
			System.out.print("Point #2 x,y: ");
			String pointB = myscan.next();
			double xB = Double.parseDouble(pointB.split(",")[0]);
			double yB = Double.parseDouble(pointB.split(",")[1]);
			System.out.print("Point #3 x,y: ");
			String pointC = myscan.next();
			double xC = Double.parseDouble(pointC.split(",")[0]);
			double yC = Double.parseDouble(pointC.split(",")[1]);
			System.out.print("Point #4 x,y: ");
			String pointD = myscan.next();
			double xD = Double.parseDouble(pointD.split(",")[0]);
			double yD = Double.parseDouble(pointD.split(",")[1]);
			double xCenter = (xA + xB + xC + xD) / 4;
			double yCenter = (yA + yB + yC + yD) / 4;
			double pointADist = Math.pow(xA - xCenter, 2) + Math.pow(yA - yCenter, 2);
			double pointBDist = Math.pow(xB - xCenter, 2) + Math.pow(yB - yCenter, 2);
			double pointCDist = Math.pow(xC - xCenter, 2) + Math.pow(yC - yCenter, 2);
			double pointDDist = Math.pow(xD - xCenter, 2) + Math.pow(yD - yCenter, 2);
			if((pointADist == pointBDist) == (pointCDist == pointDDist))
			{
				System.out.println("These points form a rectangle");
			}
			else
			{
				System.out.println("These points do not form a rectangle");
			}
		}
	}

}
