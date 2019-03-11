package point;

public class Point {
	
	private double x;
	private double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public String toString()
	{
		String string = new String("( " + x + " , " + y + " )");
			
		return string;
	}
	
	public double distance()
	{
		double distance;
		
		distance = Math.sqrt((x*x + y*y));
		
		return distance;
	}
	
	public double distance(Point anotherPoint)
	{
		double distance;
		
		distance = Math.sqrt(((this.x - anotherPoint.getX())*(this.x - anotherPoint.getX())) +  ((this.y - anotherPoint.getY())*(this.y - anotherPoint.getY())));
		
		return distance;
	}	
	
	public int quadrant()
	{
		if (x == 0 || y == 0)
		{
			return 0;
		} 
		else if (x > 0 && y > 0 ) 
		{
			return 1;
		} 
		else if (x < 0 && y > 0 ) 
		{
			return 2;
		} 
		else if (x < 0 && y < 0 ) 
		{
			return 3;
		} 
		else if (x > 0 && y < 0 ) 
		{
			return 4;
		}
		else return 5;
	}
	
	public Point nearest(Point otherPoints[])
	{
		int length = otherPoints.length;
		Point nearest = null;
		double closest = Double.MAX_VALUE;
		
		double[] distance= new double[length];
		
		for (int i = 0; i < otherPoints.length; ++i)
		{
				distance[i] = this.distance(otherPoints[i]);
				
		}
		
		for (int j = 0; j < otherPoints.length; ++j)
		{	
			if (distance[j] < closest)
			{
				closest = distance[j];
				nearest = otherPoints[j];
			}
			
		}

		System.out.println("The closest point is : " + nearest);
		
		System.out.println("The distance to the closest point is : " + closest );
		
		return nearest;
	}
}
