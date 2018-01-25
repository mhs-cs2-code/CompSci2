package CircleProjects;
import PointClassProjects.Point;
public class Circle {
	private double radius;
	private Point center;
	public Circle(double x, double y, double r)
	{
		center = new Point(x,y);
		radius = r;
	}
	public Circle(Point a, double r)
	{
		center = a;
		radius = r;
	}
	public Point getCenter()
	{
		return center;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r; 
	}
	public double getDiameter()
	{
		return 2*radius;
	}
	public void setDiameter(double d)
	{
		radius = d/2;
	}
	public double getCircumfrence()
	{
		return 2*radius*Math.PI;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
}
