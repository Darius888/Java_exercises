package homework.rational;

public class Rational {
	
	private int denominator;
	private int numerator;
	
	public Rational(int denominator)
	{
		this(denominator, 1);
	}
	
	
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();	
	}
	
	public String toString()
	{
		String result = new String();
		if (this.denominator == 1)
		{
			 return result = new String("\"" + this.numerator  + "\"");
		} else
		{
		return result = new String("\"" + this.numerator + "/" + this.denominator +  "\"");
		}
		
	}
	
	public Rational sum(Rational other)
	{
		Rational sum = new Rational(0, 0);
		sum = new Rational((this.numerator * other.denominator) + (other.numerator * this.denominator) , this.denominator* other.denominator);
		System.out.println("Sum : " + sum);
		return sum;
	}
	
	public Rational multiply(Rational other)
	{
		Rational multiply = new Rational(0, 0);
		multiply = new Rational(this.numerator * other.numerator , this.denominator * other.denominator);
		System.out.println("Product : " + multiply);
		return multiply;
	}

	public Rational sum(int otherNumerator, int otherDenominator)
	{
		Rational temp = new Rational(otherNumerator, otherDenominator);
		Rational anotherSum = new Rational(0, 0);
		anotherSum = sum(temp);
		System.out.println("Overloaded sum : " + anotherSum);
		return anotherSum;
	}
	
	public Rational multiply(int otherNumerator, int otherDenominator)
	{
		Rational temp = new Rational(otherNumerator, otherDenominator);
		Rational anotherMultiply = new Rational(0, 0);
		anotherMultiply = multiply(temp);
		System.out.println("Overloaded product : " + anotherMultiply);
		return anotherMultiply;
	}
	
	public void simplify()
	{
		if (this.denominator < 0)
		{
			this.numerator = numerator * (-1);
			this.denominator = denominator * (-1);
		} 
		
		int gcdValue = gcd();
		
		if (gcdValue != 0)
		{
			this.numerator = numerator / gcdValue;
			this.denominator = denominator / gcdValue;
		}
	}
	
	
	private int gcd()
	{
		
		int a = this.numerator;
		int b = this.denominator;
		
	
		while (b != 0)
		{
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		
		if (a < 0) 
		{
			a = -a;
		}
		return a;
	}
	
}
