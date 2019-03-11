package point;

public class TestPoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if ( args.length > 2 ) {
			System.err.println("ERROR");
		}
		
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
		Point point = new Point( x , y );
		Point anotherPoint = new Point( 1 , 0 );
		Point pointArray[] = {new Point( 10 , 10 ),new Point( 7 , 7 ),new Point( 5 , 5 )};
		
		System.out.println("String : " + point.toString());
		
		System.out.println("X coordinate : " + point.getX());
		
		System.out.println("Y coordinate : " + point.getY());
		
		System.out.println("Distance from origin : " + point.distance());
		
		System.out.println("Distance from another point : " + point.distance(anotherPoint));
		
		System.out.println("Quadrant : " + point.quadrant());
		
		point.nearest(pointArray);
	}
}
