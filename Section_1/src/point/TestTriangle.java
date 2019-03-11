package point;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(5 ,4);
		Point point2 = new Point(5 ,6);
		Point point3 = new Point(4 ,5);
		
		Triangle triangle = new Triangle("FIRE",point1, point2, point3);
	
		//triangle.sideLengths();
		
		System.out.println(triangle.area());
		System.out.println(triangle.isRegular());
		
		System.out.println(triangle.toString());
	}

}
