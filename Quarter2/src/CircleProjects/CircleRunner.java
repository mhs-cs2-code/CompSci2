package CircleProjects;

import java.util.ArrayList;
import java.util.Scanner;

import PointClassProjects.Point;

public class CircleRunner {
	private static Circle[] circles = new Circle[100];
	private static void createRandom()
	{
		for(int i = 0; i < 100; i++)
		{
			double x = Math.round(Math.random() * 41 - 20);
			double y = Math.round(Math.random() * 41 - 20);
			double radius = Math.random() * 20 + 1;
			circles[i] = new Circle(x,y,radius);
		}
		System.out.println("LOG: CREATED 100 RANDOM CIRCLES");
	}
	private static void circleList()
	{
		Scanner a = new Scanner(System.in);
		int cur = (int) 0;
		int end = 10;

		while(cur <= circles.length)
		{
			for(; cur < end; cur++)
			{
				if(cur < circles.length)
				{
					Circle c = circles[cur];
					Point p = c.getCenter();
					double x = p.getX();
					double y = p.getY();
					double r = c.getRadius();
					System.out.println("Circle #" + (((int) cur) + 1) + ": Center(" + x + ", " + y + ") and Radius: " + r);
				}
				else
				{
					return;
				}
			}
			System.out.print("Continue Printing List (n/N for no): ");
			String x = a.nextLine();
			if(x.equals("n") || x.equals("N"))
			{
				return;
			}
			else
			{
				end += 10;
			}
		}
		System.out.println("Completed List of Circles");
	}
	private static void editCircleInfo()
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Edit Circle #: ");
		int id = a.nextInt();
		Circle c = circles[id-1];
		Point p = c.getCenter();
		double x = p.getX();
		double y = p.getY();
		double r = c.getRadius();
		System.out.println("Current Circle #" + (((int) id)) + ": Center(" + x + ", " + y + ") and Radius: " + r);
		System.out.print("New X Coordinate (n for no change): ");
		String newXS = a.next();
		double newX = x;
		if(!newXS.equals("n"))
		{
			newX = Double.parseDouble(newXS);
		}
		System.out.print("New Y Coordinate (n for no change): ");
		String newYS = a.next();
		double newY = y;
		if(!newYS.equals("n"))
		{
			newY = Double.parseDouble(newYS);
		}
		System.out.print("New Radius (n for no change): ");
		String newRS = a.next();
		double newR = r;
		if(!newRS.equals("n"))
		{
			newR = Double.parseDouble(newRS);
		}
		circles[id-1] = new Circle(newX, newY, newR);
		System.out.println(newX);
	}
	private static void addNewCircle()
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Center X Coordinate: ");
		double x = a.nextDouble();
		System.out.print("Center Y Coordinate: ");
		double y = a.nextDouble();
		System.out.print("Circle Radius: ");
		double r = a.nextDouble();
		Circle[] x1 = new Circle[circles.length+1];
		for(int i = 0; i < circles.length; i++)
		{
			x1[i] = circles[i];
		}
		x1[circles.length] = new Circle(x,y,r);
		circles = x1;
		
		
	}
	private static void deleteCircle()
	{
		Scanner a = new Scanner(System.in);
		System.out.print("Delete Circle #: ");
		int id = a.nextInt();
		System.out.print("Confirm Deleting Circle #" + id + " (y for yes): ");
		String confirm = a.next();
		id -= 1;
		System.out.println(confirm);
		if(confirm.equals("y"))
		{
			int offset = 0;
			Circle[] x = new Circle[circles.length-1];
			for(int i =0; i < circles.length; i++)
			{
				if(i == id)
				{
					offset -= 1;
				}
				else
				{
					x[i+offset] = circles[i];
				}
			}
			circles = x;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to the Circle Operating System");
		createRandom();
		Scanner myscan = new Scanner(System.in);
		int option = 0;
		System.out.println("Options # | Option Desctription");
		System.out.println("--------------------------------");
		System.out.println("    0     |  End Process       ");
		System.out.println("    1     |  List All Circles  ");
		System.out.println("    2     |  Edit Circle Info  ");
		System.out.println("    3     |  Delete Circle     ");
		System.out.println("    4     |  Add New Circle     ");
		System.out.println("-------------------------------");
		while(true)
		{
			System.out.print("Your Choice: ");
			option = myscan.nextInt(); 
			if(option == 0)
				break;
			else if(option == 1)
				circleList();
			else if(option == 2)
				editCircleInfo();
			else if(option == 3)
				deleteCircle();
			else if(option == 4)
				addNewCircle();
		}
		System.out.println("Goodbye. Thanks for using the Circle OS");
		myscan.close();
	}
}
