package part_2.section_5;

import java.math.BigDecimal;



public class AreaOfCircle {
	
	public AreaOfCircle()
	{
		
	}
	
	public BigDecimal areaCalculator(BigDecimal radius, int precision)
	{

		PiCalc piCalc = new PiCalc(precision);
		
		BigDecimal pi = piCalc.compute();
		
		BigDecimal area = new BigDecimal(0);
		
		BigDecimal piSquared = new BigDecimal(0);
		
		piSquared = pi.pow(2);
		
		area = radius.multiply(piSquared);
		
		
		return area;
	}

	public static void main(String[] args) {
		
		AreaOfCircle areaOfCircle = new AreaOfCircle();
		
		BigDecimal radius = new BigDecimal(Integer.parseInt(args[0]));
		
		int precision = Integer.parseInt(args[1]);
		
		BigDecimal area = new BigDecimal(0);
		
		area = areaOfCircle.areaCalculator(radius,precision);
		
		System.out.println("The calculated area is : " + area);
		
	}
}

