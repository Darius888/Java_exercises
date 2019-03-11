package point;

public class Triangle extends Figure{
	
	private Point first;
	private Point second;
	private Point third;
	
	public Triangle(String name, Point first, Point second, Point third)
	{
		super(name);
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public double[] sideLengths()
	{
		double length1 = first.distance(second);
		double length2 = first.distance(third);
		double length3 = second.distance(third);
		double[] sideLengths = {length1, length2, length3};
		
		for ( int i = 0; i < 3 ; ++i)
		{
		System.out.println(sideLengths[i]);
		}
		return sideLengths;
	}
	
	public double area()
	{
		double area;
		
		area = 0.5 * Math.abs(first.getX()*(second.getY() - third.getY()) + second.getX()*(third.getY() - first.getY()) + third.getX()*(first.getY() - second.getY()));
		
		return area;
	}
	
	public boolean isRegular()
	{
		double[] sideLengths = sideLengths();
		boolean temp = true;
		
		for (int i = 0; i < sideLengths.length - 1 ; ++i)
		{
			if (sideLengths[i] == sideLengths[i+1])
			{
				temp = true;
			} else
			{
				temp = false;
			}
		}
		
		return temp;
	}
	
	public String toString()
	{
		String string = new String("Name of figure : " + super.getName() + " Vertexes : " + this.first + " " + this.second + " " + this.third + " ");
		
		return string;
	}
	
	public void setFirst(Point first)
	{
		this.first = first;
	}

	public Point getFirst()
	{
		return this.first;
	}
	
	public void setSecond(Point second)
	{
		this.second = second;
	}

	public Point getSecond()
	{
		return this.second;
	}
	
	public void setThird(Point third)
	{
		this.third = third;
	}

	public Point getThird()
	{
		return this.third;
	}
}
