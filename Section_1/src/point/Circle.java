package point;

import point.Figure;
import point.Point;

public class Circle extends Figure {
	
	private int radius ;
	private Point center;
	
	public Circle(String name, Point center, int radius)
	{
		super(name);
		this.center = center;
		this.radius = radius;
	}
	
	public double area()
	{
		double area ;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area ;
	}
	
	public boolean isRegular()
	{
		Circle circle = new Circle(super.getName(), this.center, this.radius);
		
		if ( circle instanceof Circle )
		{
			return true ;
		} else
		{
			return false ;
		}
	}
	
	public String toString()
	{
		String string = new String("Name of figure : " + super.getName() + " Center : " + this.center + " Radius : " + this.radius);
	
		return string;
	}
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public int getRadius()
	{
		return this.radius;
	}
	
	

}
