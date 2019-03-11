package recursion;

public class GCD {

	public static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;	
		} else if( b < 0)
		{
			return 0;
		} else
		{
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = gcd(20,40);
		System.out.println(a);

	}

}
