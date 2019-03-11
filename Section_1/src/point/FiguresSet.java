package point;

import java.util.ArrayList;

public class FiguresSet {

	private ArrayList<Figure> figures;

	public FiguresSet() {
		this.figures = new ArrayList<Figure>();
	}
	
	public double totalArea() {
		double totalArea = 0;
	
		for( int i = 0; i < figures.size() ; ++i)
		{
			totalArea += figures.get(i).area();
		}
		
		return totalArea;
	}
	
	public String toString() {
		return figures.toString();
	}
	// Adds a new figure to the FigureSet
	public void addFigure(Figure f) {
		figures.add(f);
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Point point  = new Point(2,2);
		
		Point point1 = new Point(4,6);
		Point point2 = new Point(4,5);
		Point point3 = new Point(6,7);
		
		Point point_1 = new Point(3,6);
		Point point_2 = new Point(3,3);
		Point point_3 = new Point(7,6);
		Point point_4 = new Point(7,3);
		
		FiguresSet figuresSet = new FiguresSet();
		
		Circle circle = new Circle("Circle", point, 3);
		Triangle triangle = new Triangle("Triangle", point1, point2, point3);
		Rectangle rectangle = new Rectangle("Rectangle", point_1, point_2, point_3, point_4);
		
		figuresSet.addFigure(circle);
		figuresSet.addFigure(triangle);
		figuresSet.addFigure(rectangle);
		
		System.out.println("STRING : " + figuresSet.toString());
		System.out.println("TOTAL AREA : " + figuresSet.totalArea());
		
	
	}

}
