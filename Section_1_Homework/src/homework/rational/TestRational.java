package homework.rational;

public class TestRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational other = new Rational(-5);
		Rational rational = new Rational(8, -5);
		
		System.out.println("First object : " + rational.toString());
		System.out.println("Other object : " + other.toString());
        rational.sum(other);
        rational.multiply(other);
        rational.sum(6,5);
        rational.multiply(6,5);
	}

}
