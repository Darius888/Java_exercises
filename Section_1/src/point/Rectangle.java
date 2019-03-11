package point;

public class Rectangle extends Quadrilateral {

	public Rectangle(String name, Point point1, Point point2, Point point3, Point point4) throws MyException
	{
		super(name,point1,point2,point3,point4);
		if(super.isRegular()==false)
		{
			throw new MyException("Quadrilateral figure is not a Rectangle");
		}
	}
	
	public double area()
	{
		double area=0;
		
		area = (super.getPoint1().distance(super.getPoint3())) * (super.getPoint2().distance(super.getPoint4()));
		
		return area;
	}
	
	public String toString()
	{
		String string = new String("Name of figure : " + super.getName() + " Vertexes : " + super.getPoint1() + " " + super.getPoint2() + " " + super.getPoint3() + " " + super.getPoint4() + " " );
		
		return string;
	}
	
}
