package part_2.section_6;

import java.math.BigDecimal;


public class AreaOfCircle {
	
	private BigDecimal radius;
	
	private int precision;
	
	public AreaOfCircle(BigDecimal radius, int precision)
	{
		this.radius = radius;
		
		this.precision = precision;
	}
	
	public BigDecimal areaCalculator()
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
		
		BigDecimal radius = new BigDecimal(Integer.parseInt(args[0]));
		
		int precision = Integer.parseInt(args[1]);
		
		AreaOfCircle areaOfCircle = new AreaOfCircle(radius, precision);
		
		BigDecimal area = new BigDecimal(0);
		
		area = areaOfCircle.areaCalculator();
		
		System.out.println("The calculated area is : " + area);
		
	}
}

