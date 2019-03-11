package point;

public abstract class Quadrilateral extends Figure {
	
	private Point point1,point2,point3,point4;
	
	public Quadrilateral (String name, Point point1, Point point2, Point point3, Point point4 ) throws MyException
	{
		super(name);		
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}
	
	public boolean isRegular()
	{
		if (checkRectangle(point1, point2, point3, point4))
		{
			return true;
		} else
			return false;
	}
	
	public String toString()
	{
		String string = new String(" Name : " + super.getName() + " Vertexes : "  + this.point1 + " " + this.point2 + " " + this.point3 + " " + this.point4);
		
		return string;
	}
	
	public void setPoint1(Point point1)
	{
		this.point1 = point1;
	}
	
	public Point getPoint1()
	{
		return point1;
	}
	
	public void setPoint2(Point point2)
	{
		this.point2 = point2;
	}
	
	public Point getPoint2()
	{
		return point2;
	}
	
	public void setPoint3(Point point3)
	{
		this.point3 = point3;
	}
	
	public Point getPoint3()
	{
		return point3;
	}
	
	public void setPoint4(Point point4)
	{
		this.point4 = point4;
	}
	
	public Point getPoint4()
	{
		return point4;
	}
	
	
	private boolean checkRectangle(Point v1, Point v2, Point v3, Point v4){
		Point auxVertex = v1.nearest(new Point[]{v2,v3,v4});
		if (auxVertex.equals(v2)){
		return v1.distance(v3) == v2.distance(v4)
		&& v1.distance(v4) == v2.distance(v3)
		&& scalarProduct(v1,auxVertex,v1.nearest(new Point[]{v3,v4}));
		} else if (auxVertex.equals(v3)){
		return v1.distance(v2) == v3.distance(v4)
		&& v1.distance(v4) == v3.distance(v2)
		&& scalarProduct(v1,auxVertex,v1.nearest(new Point[]{v2,v4}));
		} else if (auxVertex.equals(v4)){

		return v1.distance(v2) == v4.distance(v3)
		&& v1.distance(v3) == v4.distance(v2)
		&& scalarProduct(v1,auxVertex,v1.nearest(new Point[]{v2,v3}));
		} else {
		return false;
		}
	}
	
	private boolean scalarProduct(Point p1, Point p2, Point p3){
		return (p3.getY()-p1.getY())*(p2.getY()-p1.getY())
		+ (p3.getX()-p1.getX())*(p2.getX()-p1.getX()) == 0;
	}
	
	

}
