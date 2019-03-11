package part_2.section_6;

import java.math.BigDecimal;

public class TotalAreaOfCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal totalAreaOfCircles = BigDecimal.ZERO;
		
		BigDecimal radius = new BigDecimal(0);
		
		int precision = Integer.parseInt(args[0]);
		
		int temp1 = 0;
	
		for (int i = 1; i < args.length ; ++i)
		{
			
			temp1 = Integer.parseInt(args[i]);
			
			radius = BigDecimal.valueOf(temp1);
			
			AreaOfCircle areaOfCircle = new AreaOfCircle(radius, precision);
			
			totalAreaOfCircles = totalAreaOfCircles.add(areaOfCircle.areaCalculator());
			
		}
		
		System.out.println("Total area of " + (args.length-1) + " circles is : " + totalAreaOfCircles);

	}

}
